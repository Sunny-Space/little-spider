package com.littlejava;

import com.littlejava.model.News;
import com.littlejava.model.NewsFactory;
import com.littlejava.view.NewsListViewer;

import java.util.ArrayList;

public class Main {
    // 本地存储新闻内容，如何在终端显示

    //1.抽象出对象
    //2.设计好对象应该具有的行为和状态
    //3.思考对象之间的交互
    //4.开始编码

    public static void main(String[] args) throws Exception {

        String resource_path = Main.class.getClassLoader().getResource("read_hub").getPath();

        NewsFactory newsReader = new NewsFactory(resource_path);

        ArrayList<News> newsList = newsReader.fetch();


        NewsListViewer viewer = new NewsListViewer(newsList);

        viewer.display();
    }
}
