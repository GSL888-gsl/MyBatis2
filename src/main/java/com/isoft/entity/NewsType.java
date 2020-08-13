package com.isoft.entity;

import java.io.Serializable;
import java.util.List;

public class NewsType implements Serializable {
    private Integer id;
    private String typename;
    private List<News> newsList;

    public NewsType(Integer id, String typename) {
        this.id = id;
        this.typename = typename;
    }

    public NewsType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    @Override
    public String toString() {
        return "NewsType{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", newsList=" + newsList +
                '}';
    }
}
