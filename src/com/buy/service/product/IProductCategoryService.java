package com.buy.service.product;

import com.buy.entity.ProductCategory;

import java.util.List;

public interface IProductCategoryService {
    List<ProductCategory> queryAllProductCategory(String parentId);
}
