package com.littlejava.model;

import java.util.HashMap;
import java.util.Map;

//创建一个新闻类（抽象出一个News类）
public class News {
    //新闻的标题
    private String title;
    //新闻的内容
    private String content;
    private Map<String,String> related; //日期--->标题 发生的和这个日期相关的新闻

    //生成构造函数,初始化成员变量
    public News(String title, String content) {
        this.title = title;
        this.content = content;
        this.related = new HashMap<String, String>();
    }

    public void addRelated(String date,String related_title){
        //TODO 请在这里填写你的代码
    }

    public Map<String, String> getRelated() {
        return related;
    }

    public void setRelated(Map<String, String> related) {
        this.related = related;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
