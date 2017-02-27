package com.sun.online_shopping.model;

/**
 * Created by 朱亦天 on 2017/2/24.
 */
public class Commoditytype {
    //商品种类ID
    private int id;
    //商品种类名称
    private String name;

    public Commoditytype(){}
    public Commoditytype(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Commoditytype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
