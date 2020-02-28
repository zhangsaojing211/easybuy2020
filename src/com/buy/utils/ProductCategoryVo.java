package com.buy.utils;

import com.buy.entity.Product;
import com.buy.entity.ProductCategory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductCategoryVo {
    //Vo
    List<ProductCategoryVo> productCategoryVList= new ArrayList<>();
    //商品分类
    private ProductCategory productCategory;
    //商品
    private Product product;

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<ProductCategoryVo> getProductCategoryVList() {
        return productCategoryVList;
    }

    public void setProductCategoryVList(List<ProductCategoryVo> productCategoryVList) {
        this.productCategoryVList = productCategoryVList;
    }
}
