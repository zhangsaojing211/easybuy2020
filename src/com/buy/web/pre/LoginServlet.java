package com.buy.web.pre;

import com.buy.entity.User;
import com.buy.service.user.UserService;
import com.buy.service.user.UserServiceImpl;
import com.buy.utils.EmptyUtils;
import com.buy.utils.ReturnResult;
import com.buy.utils.SecurityUtils;
import com.buy.web.AbstractServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet",urlPatterns = {"/login"})
public class LoginServlet extends AbstractServlet {
    //注入用户业务类,依赖于service层
    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService=new UserServiceImpl();
    }

    /**
     * 实例化servlet
     * @return
     */
    @Override
    public Class getServletClass() {
        return LoginServlet.class;
    }


    /**
     * 跳转到登陆界面
     * @param request
     * @param response
     * @return
     */
    public String toLogin(HttpServletRequest request,HttpServletResponse response)throws Exception{
        return "/front/login";
    }
    /**
     * 登陆的方法
     * @param request
     * @return
     */
    public ReturnResult login(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ReturnResult result=new ReturnResult();
        //参数获取
        String loginName=request.getParameter("loginName");
        String password=request.getParameter("password");
        User user=userService.getUser(loginName);
        if(EmptyUtils.isEmpty(user)){
            result.returnFail("用户不存在");
        }else{
            if(user.getPassword().equals(SecurityUtils.md5Hex(password))){
                //登陆成功
                request.getSession().setAttribute("loginUser", user);
                result.returnSuccess("登陆成功");
            }else{
                result.returnFail("密码错误");
            }
        }
        return result;
    }
    /**
     * 登陆的方法
     * @param request
     * @return
     */
    public String loginOut(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ReturnResult result=new ReturnResult();
        try {
            request.getSession().removeAttribute("loginUser");
            // 清除购物车
            request.getSession().removeAttribute("cart");
            request.getSession().removeAttribute("cart2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        result.returnSuccess("注销成功");
        return "/front/login";
    }

}
