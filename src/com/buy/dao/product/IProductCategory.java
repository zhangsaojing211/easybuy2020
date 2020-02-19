package com.buy.dao.product;

import com.buy.entity.ProductCategory;

import java.util.List;

public interface IProductCategory {
    //获取商品的一级分类
    List<ProductCategory> queryAllProductCategory(String parentId);
}
