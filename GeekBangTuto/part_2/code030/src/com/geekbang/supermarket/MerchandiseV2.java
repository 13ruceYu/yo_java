package com.geekbang.supermarket;

public class MerchandiseV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    // TODO 访问修饰符
    // TODO 返回值类型：void 表示无返回值
    // TODO 方法名
    // TODO 参数列表
    // TODO 方法体
    public void describe() {
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名:"+name);
        System.out.println("id:"+id);
        System.out.println("售价:"+soldPrice);
        System.out.println("进价:"+purchasePrice);
        System.out.println("库存:"+count);
        System.out.println("毛利:"+netIncome);
    }
    public double calculateProfit() {
        return soldPrice = purchasePrice;
    }
}
