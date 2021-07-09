public class ReferenceAndPrimaryDataType {
    public static void main(String[] args) {
        // TODO m1 是 Merchandise 类型的引用，只能指向 Merchandise 类的实例
        // TODO 引用数据类型变量包含两部分信息：类型 & 实例
        // TODO 每个引用数据类型的变量（简称引用），都是指向某个类的一个实例/对象
        // TODO 引用的类型信息就确定，不可更改，但可以指向当前类的不同实例
        Merchandise m1;
        m1 = new Merchandise();
        Merchandise m2 = new Merchandise();

        m1 = m2;
        // m1 = 3;

        // TODO 引用与基本数据类型的相同点：
        // TODO 1. 都可用来创建变量，赋值，使用值；
        // TODO 2. 本身都是地址

        // TODO 引用与基本数据类型的不同点：
        // TODO 基本类型变量的值，就是地址对应的值，引用数据类型的值，还是一个地址，需要通过"二级跳"找到实例
        // TODO 引用数据类型是 Java 的一种内部类型，是对所有自定义类型和数组引用的统称，不是某种具体的类型

    }
}
