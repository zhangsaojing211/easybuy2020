package com.buy.dao.product;

import com.buy.entity.ProductCategory;
import com.buy.utils.DataSourceUtil;
import com.buy.utils.ProductCategoryVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductCategoryImpl implements IProductCategory {

    /**
     * 根据parentId查询所有的分类信息
     * @param parentId
     * @return
     */
    @Override
    public List<ProductCategory> queryAllProductCategory(Integer parentId) {
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

    /**
     * 查询出所有的分类信息
     * @return
     */
    @Override
    public List<ProductCategoryVo> queryAllProductCategory() {
        //查询一级分类的列表
        List<ProductCategoryVo> pc1VoList = new ArrayList<ProductCategoryVo>();
        //查询一级分类
        List<ProductCategory> pcList = queryAllProductCategory(0);
        //查询二级分类
        for (ProductCategory productCategory1 : pcList) {
            ProductCategoryVo pc1Vo = new ProductCategoryVo();
            pc1Vo.setProductCategory(productCategory1);
            //查询二级分类的VO
            List<ProductCategoryVo> pc2VoList = new ArrayList<ProductCategoryVo>();
            //查询二级分类
            List<ProductCategory> pc2List
                    = queryAllProductCategory(productCategory1.getId());
            for (ProductCategory productCategory2 : pc2List) {
                ProductCategoryVo pc2Vo = new ProductCategoryVo();
                pc2Vo.setProductCategory(productCategory2);
                //查询三级分类的VO
                List<ProductCategoryVo> pc3VoList = new ArrayList<ProductCategoryVo>();
                //查询三级分类
                List<ProductCategory> pc3List
                        = queryAllProductCategory(productCategory2.getId());
                for (ProductCategory productCategory3 : pc3List) {
                    ProductCategoryVo pc3Vo = new ProductCategoryVo();
                    pc3Vo.setProductCategory(productCategory3);
                    //
                    pc3VoList.add(pc3Vo);
                }
                pc2Vo.setProductCategoryVList(pc3VoList);
                pc2VoList.add(pc2Vo);
            }
            pc1Vo.setProductCategoryVList(pc2VoList);
            pc1VoList.add(pc1Vo);
        }
        return pc1VoList ;
    }
}
