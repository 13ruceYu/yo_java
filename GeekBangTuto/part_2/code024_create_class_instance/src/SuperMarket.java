public class SuperMarket {
    public static void main(String[] args) {
        // TODO 使用 new 操作符，可以创建一个类的实例/对象（instance/object）
        // TODO new 出一个类的实例后，类中定义的每种变量都会被赋予其类型的初始值
        // TODO 使用一个同类型的对象变量，可以指向并操作这个实例

        // 创建一个 Merchandise 的实例，用 m1 指向它
        Merchandise m1 = new Merchandise();
        // 其类型的初始值
        System.out.println(m1.count);
        System.out.println(m1.price);
        // 用点操作符，给 m1 指向的实例赋值
        m1.name = "哇哈哈";
        m1.id = "1";
        m1.price = 3.6;
        m1.count = 10;

        // 卖出 1 个商品
        int m1SoldCount = 1;
        System.out.println("卖出" + m1.name + m1SoldCount + "个，单价" + m1.price + "元。");
        m1.count -= m1SoldCount;
        System.out.println("剩余" + m1.name + "库存" + m1.count + "个。");
    }
}
