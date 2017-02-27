package com.sun.online_shopping.model;

/**
 * Created by 朱亦天 on 2017/2/24.
 */
public class Commodity {
    //商品ID
    private int id;
    //商品名称
    private String name;
    //商品进价
    private int inprice;
    //商品库存
    private int count;
    //商品售价
    private int outprice;

    public Commodity(){}

    public Commodity(String name, int inprice, int count, int outprice) {
        this.name = name;
        this.inprice = inprice;
        this.count = count;
        this.outprice = outprice;
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

    public int getInprice() {
        return inprice;
    }

    public void setInprice(int inprice) {
        this.inprice = inprice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOutprice() {
        return outprice;
    }

    public void setOutprice(int outprice) {
        this.outprice = outprice;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inprice=" + inprice +
                ", count=" + count +
                ", outprice=" + outprice +
                '}';
    }
}
