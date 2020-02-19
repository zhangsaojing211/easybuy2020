package com.buy.dao.product;

import com.buy.entity.ProductCategory;
import com.buy.utils.DataSourceUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductCategoryImpl implements IProductCategory {
    @Override
    public List<ProductCategory> queryAllProductCategory(String parentId) {
        List<ProductCategory> productCategories=new ArrayList<ProductCategory>();
        ProductCategory productCategory =null;

        try {
            StringBuffer sql=new StringBuffer();
            sql.append("Select * from easybuy_product_category where 1=1");

            //判断parentID的值，如果为0，显示一级分类
            if(!"".equals(parentId)||null!=parentId){
                sql.append(" and parentid = ?");
            }
            //获取连接
            Connection conn= DataSourceUtil.getConn();
            System.out.println(sql);
            PreparedStatement pstmt=conn.prepareStatement(sql.toString());
            pstmt.setObject(1,parentId);
            ResultSet rs=pstmt.executeQuery();
            while (rs.next()){
                productCategory=new ProductCategory();
                productCategory.setId(rs.getInt(1));
                productCategory.setName(rs.getString(2));
                productCategory.setParentId(rs.getInt(3));
                productCategory.setType(rs.getInt(4));
                productCategory.setIconClass(rs.getString(5));

                //将对象填充到集合中
                productCategories.add(productCategory);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productCategories;
    }
}
