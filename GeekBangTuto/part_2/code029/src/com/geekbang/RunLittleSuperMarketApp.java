package com.geekbang;

import com.geekbang.supermaket.LittleSuperMarket;
import com.geekbang.supermaket.Merchandise;

public class RunLittleSuperMarketApp {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.superMarketName = "bobo杂货铺";
        littleSuperMarket.address = "火炬大道 666 号";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[10];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        Merchandise[] all = littleSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }

        System.out.println("超市开门啦！");

        boolean open = true;
        while (open) {
            System.out.println("本店叫做" + littleSuperMarket.superMarketName);
            System.out.println("本店地址：" + littleSuperMarket.address);
            System.out.println("共有停车位" + littleSuperMarket.parkingCount + "个");
            System.out.println("今天营业额为" + littleSuperMarket.incomingSum);
            System.out.println("共有商品" + littleSuperMarket.merchandises.length + "中");
        }
    }
}
