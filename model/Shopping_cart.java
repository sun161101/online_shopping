package com.sun.online_shopping.model;

/**
 * Created by 朱亦天 on 2017/2/24.
 */
public class Shopping_cart {
    //购物车ID
    private int id;
    //商品数量
    private int count;
    //商品是否付款Y:已付款，N:未付款；
    private String y_n;

    public Shopping_cart(){}
    public Shopping_cart(int count, String y_n) {
        this.count = count;
        this.y_n = y_n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getY_n() {
        return y_n;
    }

    public void setY_n(String y_n) {
        this.y_n = y_n;
    }

    @Override
    public String toString() {
        return "Shopping_cart{" +
                "id=" + id +
                ", count=" + count +
                ", y_n='" + y_n + '\'' +
                '}';
    }
}
