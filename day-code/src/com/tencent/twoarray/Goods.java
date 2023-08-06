package com.tencent.twoarray;

public class Goods {
    private  int id;
    private String name;
    private double price;
    private int save;

    public Goods() {
    }

    public Goods(int id, String name, double price, int save) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.save = save;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return save
     */
    public int getSave() {
        return save;
    }

    /**
     * 设置
     * @param save
     */
    public void setSave(int save) {
        this.save = save;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", save=" + save +
                '}';
    }
}
