public class ArrayIsClass {
    public static void main(String[] args) {
        // TODO "数组变量"本质就是引用，数组类型就是一种特殊的类
        // TODO 数组的大小不决定数组的类型，数组类型只由其元素类型决定
        int[] intArr = new int[3];
        int[] intArr2 = new int[4];
        intArr = intArr2;
    }
}
