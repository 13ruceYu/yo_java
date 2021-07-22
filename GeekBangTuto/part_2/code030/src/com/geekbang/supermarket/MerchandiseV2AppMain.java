package com.geekbang.supermarket;

public class MerchandiseV2AppMain {
    public static void main(String[] args) {
        MerchandiseV2 m = new MerchandiseV2();
        m.name = "哇哈哈";
        m.id = "1";
        m.purchasePrice = 13;
        m.soldPrice = 14;
        m.describe();
    }
}
