package com.buy.web;

import com.buy.dao.news.INewDao;
import com.buy.entity.News;
import com.buy.entity.ProductCategory;
import com.buy.service.news.INewsService;
import com.buy.service.news.NewsServiceImpl;
import com.buy.service.product.IProductCategoryService;
import com.buy.service.product.ProductCategroyServiceImpl;
import com.buy.utils.ProductCategoryVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet",urlPatterns = {"/home"})
public class HomeServlet extends AbstractServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //从service层获取数据
//        IProductCategoryService productCategoryService = new ProductCategroyServiceImpl();
//        List<ProductCategory> categoryList = productCategoryService.queryAllProductCategory("0");
//
//        //存储数据
//        request.setAttribute("categoryList",categoryList);
//
//        //携带数据跳转到home.jsp
//        request.getRequestDispatcher("/front/home.jsp").forward(request,response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request,response);
//    }

    IProductCategoryService productCategoryService;
    INewsService newsService;
    @Override
    public void init() throws ServletException {
        productCategoryService = new ProductCategroyServiceImpl();
        newsService=new NewsServiceImpl();
    }

    public String index(HttpServletRequest request, HttpServletResponse response)throws Exception{
        //从service层获取数据
        List<ProductCategoryVo> categoryList = productCategoryService.queryAllProductCategory();
         List<News> newsList=newsService.getAllNewList();
        //存储数据
        request.setAttribute("categoryList",categoryList);
         request.setAttribute("newsList",newsList);
        //页面跳转
        return "/front/home";

    }

    @Override
    public Class getServletClass() {
        return HomeServlet.class;
    }
}
