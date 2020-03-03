package com.buy.test;

import com.buy.dao.product.IProductDao;
import com.buy.dao.product.ProductImpl;
import com.buy.entity.Product;
import com.buy.utils.ProductParams;
import org.junit.Test;

public class TestProduct {
    IProductDao dao=new ProductImpl();
    @Test
    public void testProuct(){

        ProductParams product=new ProductParams();
        product.setKeyWords("电饭");
        System.out.println(dao.queryProdutcList(product).size());

    }
@Test
    public void testCount(){
        ProductParams product=new ProductParams();
        product.setSort("name");
    System.out.println(dao.queryProdutcCount(product));
    }
}

