package com.littlejava.view;

import com.littlejava.model.News;

import java.util.ArrayList;

//这个类的作用就是用来显示我们的新闻列表
public class NewsListViewer {
    private ArrayList<News> newsList;

    public NewsListViewer(ArrayList<News> newsList){
        this.newsList = newsList;
    }

    public void display(){
        for(News news:newsList){
            System.out.println("title"+news.getTitle());
            System.out.println("content"+news.getContent());

            //输出你的信息
        }

    }

}
