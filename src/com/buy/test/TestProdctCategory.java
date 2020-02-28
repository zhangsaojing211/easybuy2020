package com.buy.test;

import com.buy.dao.product.IProductCategory;
import com.buy.dao.product.ProductCategoryImpl;
import com.buy.entity.ProductCategory;
import com.buy.service.product.IProductCategoryService;
import com.buy.service.product.ProductCategroyServiceImpl;
import org.junit.Test;


import java.util.List;

public class TestProdctCategory {
      @Test
            public void testProductCategory(){
            IProductCategoryService service=new ProductCategroyServiceImpl();
            List<ProductCategory> productCategories=service.queryAllProductCategory(0);
            for (ProductCategory category:productCategories) {
                  System.out.println(category.getName());
            }
        }
}
