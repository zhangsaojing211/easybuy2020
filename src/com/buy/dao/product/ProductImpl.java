package com.buy.dao.product;

import com.buy.entity.Product;
import com.buy.utils.DataSourceUtil;
import com.buy.utils.EmptyUtils;
import com.buy.utils.ProductParams;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl extends DataSourceUtil implements IProductDao {
   ResultSet rs;
   Connection conn;
   public Product toTableClass(ResultSet rs)throws SQLException{
       Product product=new ProductParams();
       product.setId(rs.getInt("id"));
       product.setName(rs.getString("name"));
       product.setDescription(rs.getString("description"));
       product.setPrice(rs.getFloat("price"));
       product.setStock(rs.getInt("stock"));
       product.setCategoryLevel1Id(rs.getInt("categoryLevel1Id"));
       product.setCategoryLevel2Id(rs.getInt("categoryLevel2Id"));
       product.setCategoryLevel3Id(rs.getInt("categoryLevel3Id"));
       product.setFileName(rs.getString("filename"));
       return product;
   }
    @Override
    public List<Product> queryProdutcList(ProductParams params) {
        List<Product> productList=new ArrayList<>();
        conn=DataSourceUtil.getConn();
        try {
            //编写sql语句
            StringBuffer sql=new StringBuffer();
            sql.append("select * from easybuy_product where 1=1");

            //判断参数，设置不同的查询条件

            if (EmptyUtils.isNotEmpty(params.getKeyWords())) {//1.模糊查询
                sql.append(" and name like ?");
                rs=this.executeQuery(sql.toString(),"%"+params.getKeyWords()+"%");
            }else if (EmptyUtils.isNotEmpty(params.getCategoryId())) { //2.分类查询
                sql.append(" and (categoryLevel1Id = ? or categoryLevel2Id=? or categoryLevel3Id =?)");
                rs=this.executeQuery(sql.toString(),params.getCategoryId(),params.getCategoryId(),params.getCategoryId());
            }else if (EmptyUtils.isNotEmpty(params.getSort())) {   //3.排序
                sql.append(" order by ?");
                rs=this.executeQuery(sql.toString(),params.getSort());
            }else  if (EmptyUtils.isNotEmpty(params.isPage())) { //分页
                sql.append(" limit ?,?");
                rs=this.executeQuery(sql.toString(),params.getStartIndex(),params.getPageSize());
            }
            //执行查询
           while (rs.next()){
               Product product=this.toTableClass(rs);
               productList.add(product);
           }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DataSourceUtil.closeConnection(conn);
        }


        return productList;
    }

    @Override
    public int queryProdutcCount(ProductParams params) {
        int Count = 0;
        try {
            //编写sql语句
            StringBuffer sql=new StringBuffer();
            sql.append("select count(1) from easybuy_product where 1=1");

            //判断参数，设置不同的查询条件

            if (EmptyUtils.isNotEmpty(params.getKeyWords())) {//1.模糊查询
                sql.append(" and name like ?");
                rs=this.executeQuery(sql.toString(),"%"+params.getKeyWords()+"%");
            }else if (EmptyUtils.isNotEmpty(params.getCategoryId())) { //2.分类查询
                sql.append(" and (categoryLevel1Id = ? or categoryLevel2Id=? or categoryLevel3Id =?)");
                rs=this.executeQuery(sql.toString(),params.getCategoryId(),params.getCategoryId(),params.getCategoryId());
            }else if (EmptyUtils.isNotEmpty(params.getSort())) {   //3.排序
                sql.append(" order by ?");
                rs=this.executeQuery(sql.toString(),params.getSort());
            }else  if (EmptyUtils.isNotEmpty(params.isPage())) { //分页
                sql.append(" limit ?,?");
                rs=this.executeQuery(sql.toString(),params.getStartIndex(),params.getPageSize());
            }
            //执行查询
            if (rs.next()){
                Count=rs.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
            Count=-1;
        } finally {
            DataSourceUtil.closeConnection(conn);
        }
        return Count;
    }
}
