package com.geekbang;

import com.geekbang.person.Customer;
import com.geekbang.supermaket.LittleSuperMarket;
import com.geekbang.supermaket.Merchandise;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        while (open) {
            System.out.println("本店叫做" + littleSuperMarket.superMarketName);
            System.out.println("本店地址：" + littleSuperMarket.address);
            System.out.println("共有停车位" + littleSuperMarket.parkingCount + "个");
            System.out.println("今天营业额为" + littleSuperMarket.incomingSum);
            System.out.println("共有商品" + littleSuperMarket.merchandises.length + "中");

            Customer customer = new Customer();
            customer.name = "顾客编号" + ((int)(Math.random() * 10000));
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来，停车免费，停车位为：" + littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount--;
                } else {
                    System.out.println("停车位已满，欢迎下次光临。");
                }
            } else {
                System.out.println("欢迎" + customer.name + "来店选购。");
            }

            double totalCost = 0;
            while (true) {
                System.out.println("本店提供" + all.length + "种商品，欢迎选购。请输入商品编号：");
                int index = scanner.nextInt();

                if (index < 0) {
                    break;
                }

                if (index >= all.length) {
                    System.out.println("本店暂无此商品，输入的编号请在 0 - " + (all.length-1) + "之内。");
                    continue;
                }

                Merchandise m = all[index];

                System.out.println("您选购的商品名字" + m.name + "，单价是" + m.soldPrice + "，请输入购买数量：");
                int numToBuy = scanner.nextInt();

                if (numToBuy <= 0) {
                    System.out.println("不买看看也好，欢迎继续挑选。");
                    continue;
                }

                if (numToBuy > m.count) {
                    System.out.println("商品库存不足。");
                }

                if (numToBuy * m.purchasePrice > customer.money) {
                    System.out.println("您的余额不足。");
                }

                totalCost += numToBuy * m.soldPrice;

                m.count -= numToBuy;
                littleSuperMarket.merchandiseSold[index] += numToBuy;
            }

            customer.money -= totalCost;

            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }

            System.out.println("顾客" + customer.name + "共消费" + totalCost);

            littleSuperMarket.incomingSum = totalCost;

            System.out.println("是否继续营业？");
            open = scanner.nextBoolean();
        }

        System.out.println("超市关门了！");
        System.out.println("今日营业额为" + littleSuperMarket.incomingSum + "，营业情况如下：");

        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++) {
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if (numSold > 0) {
                double incoming = m.soldPrice * numSold;
                double netIncoming = (m.soldPrice - m.soldPrice) * numSold;
                System.out.println(m.name + "售出了" + numSold + "个，销售额为" + incoming + "。净利润为" + netIncoming);
            }
        }
    }
}
