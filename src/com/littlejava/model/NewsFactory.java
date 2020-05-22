package com.littlejava.model;

import java.io.*;
import java.util.ArrayList;

//这个工厂是用来生成news对象的，Factory的职责就是去读取news文件，然后生成news对象
public class NewsFactory {

    private File newDir;

    public NewsFactory(String dir) throws  Exception{

        newDir = new File(dir);//打开目录

        //先检查是否存在
        if(!newDir.exists()){
            //抛出异常
                throw new Exception("路径不存在！");
        }

        //再检查是不是一个路径
        if(!newDir.isDirectory()){
            throw new Exception("输入不是一个合法的路径!");
        }

    }

    public ArrayList<News> fetch() {
        ArrayList<News> arrayList = new ArrayList<News>();
        File[] files = newDir.listFiles();

        if (files != null) {
            for (File file : files) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String title = reader.readLine();//读取title
                    reader.readLine();//读取空行
                    String content = reader.readLine();//读取首行
                    News news = new News(title, content);


                    //TODO 添加代码读取相关新闻
                    arrayList.add(news);

                } catch (IOException e) {
                    System.out.println("新闻读取出错");
                }

            }
        }

        return arrayList;
    };





}

