package com.buy.dao.product;

import com.buy.entity.ProductCategory;
import com.buy.utils.ProductCategoryVo;

import java.util.List;

public interface IProductCategory {
    //获取商品的一级分类
    List<ProductCategory> queryAllProductCategory(Integer parentId);


    //获取商品的所以分类
    List<ProductCategoryVo> queryAllProductCategory();
}

