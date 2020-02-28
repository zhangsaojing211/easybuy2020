package com.buy.test;

import com.buy.dao.news.INewDao;
import com.buy.dao.news.NewsDaoImpl;
import com.buy.entity.News;
import com.buy.service.news.INewsService;
import org.junit.Test;

import java.util.List;

public class TestNews {
    @Test
    public void test(){
        INewDao dao=new NewsDaoImpl();
        List<News> list =dao.getAllNewList();
        System.out.println(list.size());
    }
}
