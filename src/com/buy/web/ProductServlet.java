package com.buy.web;

import com.buy.entity.Product;
import com.buy.entity.ProductCategory;
import com.buy.service.product.IProductCategoryService;
import com.buy.service.product.IProductService;
import com.buy.service.product.ProductCategroyServiceImpl;
import com.buy.service.product.ProductServiceImpl;
import com.buy.utils.EmptyUtils;
import com.buy.utils.Pager;
import com.buy.utils.ProductCategoryVo;
import com.buy.utils.ProductParams;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = {"/Product"})
public class ProductServlet extends AbstractServlet {

    IProductService iProductService;

    IProductCategoryService productCategoryService;
    @Override
    public void init() throws ServletException {
        iProductService=new ProductServiceImpl();
        productCategoryService=new ProductCategroyServiceImpl();
    }

    @Override
    public Class getServletClass() {
        return ProductServlet.class;
    }

    protected  String queryProducts(HttpServletRequest request,HttpServletResponse response)throws ServletException{
        //获取查询条件
        //商品分类
        String categoryId=request.getParameter("categoryId");
        //查询关键字
        String keyWord=request.getParameter("keyWord");
        //分页参数
        String currentPage=request.getParameter("currentPage");
        String pageSize=request.getParameter("pageSize");
        int rowPage=EmptyUtils.isNotEmpty(pageSize)?Integer.valueOf(pageSize):8;
        int currentIndex=EmptyUtils.isNotEmpty(currentPage)?Integer.valueOf(currentPage):1;

        //分装查询条件
        ProductParams params=new ProductParams();
        params.setCategoryId(EmptyUtils.isNotEmpty(categoryId) ? Integer.valueOf(categoryId):null);
        params.setKeyWords(keyWord);
        //分页
        params.openPage((currentIndex-1)*rowPage,rowPage);
        int count=iProductService.queryProdutcCount(params);
         //调用分页的工具类
        Pager pager=new Pager(count,rowPage,currentIndex);
        pager.setUrl("/Product?action=queryProducts&categoryId="
                +(EmptyUtils.isNotEmpty(categoryId)?categoryId:null)+"&keyWord="+keyWord);
        //获取商品的分类
        List<ProductCategoryVo>  productCategoryVos=productCategoryService.queryAllProductCategory();
        List<Product> productList=iProductService.queryProdutcList(params);

        //封装数据提供前端使用
        request.setAttribute("keyWord",keyWord);
        request.setAttribute("pager",pager);
        request.setAttribute("count",count);
        request.setAttribute("keyWord",keyWord);
        request.setAttribute("pctList",productList);
        request.setAttribute("categoryList",productCategoryVos);

        //页面跳转
        return "/front/productList";
    }
}
