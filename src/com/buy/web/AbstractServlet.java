package com.buy.web;

import com.buy.utils.EmptyUtils;
import com.buy.utils.PrintUtil;
import com.buy.utils.ReturnResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@WebServlet(name = "AbstractServlet")
public abstract class AbstractServlet extends HttpServlet {

    //用来获取servlet对象实例
    public abstract Class getServletClass();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        Method method=null;
        Object result=null;
        try {
            //根据action参数来决定页面的跳转情况
            if (EmptyUtils.isEmpty(action)) {
                //如果参数为空，跳转的首页
                result = execute(request, response);
            } else {
                //有参数的处理方式
                method = getServletClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
                result = method.invoke(this, request, response);
            }
            toView(request, response,result);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            String viewName="404.jsp";
            request.getRequestDispatcher(viewName).forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
            if(!EmptyUtils.isEmpty(result)){
                if(result instanceof String){
                    String viewName= "500.jsp";
                    request.getRequestDispatcher(viewName).forward(request,response);
                }else {
                    ReturnResult returnResult=new ReturnResult();
                    returnResult.returnFail("系统错误");
                    PrintUtil.write(returnResult,response);
                }
            }else {
                String viewName= "500.jsp";
                request.getRequestDispatcher(viewName).forward(request,response);
            }
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    /**
     * 根据servlet调用方法的返回结果，决定下一步是返回jsp页面，还是打印json数据
     * @param result servlet调用方法的返回结果
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void toView(HttpServletRequest request,HttpServletResponse response,Object result) throws ServletException, IOException {
        if (!EmptyUtils.isEmpty(result)){
            //判断result是不是json数据，如果不足，则加后缀jsp
            if(result instanceof String){
                String viewName=result.toString()+".jsp";
                request.getRequestDispatcher(viewName).forward(request,response);
        }else {//返回的是json数据
            PrintUtil.write(result,response);
        }
        }
    }

    public Object execute(HttpServletRequest request,HttpServletResponse response){
        return "/front/home";
    }
}
