public class RefArray {
    public static void main(String[] args) {
        Merchandise[] merchandises = new Merchandise[4];
        merchandises[0] = new Merchandise();
        merchandises[0].name = "wahaha";

        System.out.println(merchandises[0]);
        System.out.println(merchandises[0].id);
        System.out.println(merchandises[0].name);
        // 基本类型缺省值根据变量类型初始化
        System.out.println(merchandises[0].count);
        // 引用类型缺省值 null
        System.out.println(merchandises[1]);
    }
}
