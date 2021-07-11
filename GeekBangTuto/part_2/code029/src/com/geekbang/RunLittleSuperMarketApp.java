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
    }
}
