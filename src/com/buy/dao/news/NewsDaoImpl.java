package com.buy.dao.news;

import com.buy.entity.News;
import com.buy.utils.DataSourceUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewsDaoImpl extends DataSourceUtil implements INewDao {
    ResultSet rs;
    Connection conn;

    public News toTableClass(ResultSet rs)throws SQLException{
        News news = new News();
        news.setId(rs.getInt("id"));
        news.setTitle(rs.getString("title"));
        news.setContent(rs.getString("content"));
        news.setCreateTime(rs.getDate("createTime"));
        return news;
    }
    @Override
    public List<News> getAllNewList() {
        List<News> newsList=new ArrayList<>();
        News news=null;
        try {
            StringBuffer sql=new StringBuffer();
            sql.append("select * from easybuy_news");
            sql.append(" limit 0,5");
            rs=this.executeQuery(sql.toString());
            while(rs.next()){
                news=toTableClass(rs);
                newsList.add(news);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DataSourceUtil.closeConnection(conn);
        }
        return newsList;
    }
}
