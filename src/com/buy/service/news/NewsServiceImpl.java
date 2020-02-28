package com.buy.service.news;

import com.buy.dao.news.INewDao;
import com.buy.dao.news.NewsDaoImpl;
import com.buy.entity.News;

import java.util.List;

public class NewsServiceImpl implements INewsService {
    INewDao newDao=new NewsDaoImpl();
    @Override
    public List<News> getAllNewList() {
        return newDao.getAllNewList();
    }
}
