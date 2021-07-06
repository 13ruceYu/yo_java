import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        // 声明 6 个变量，代表 6 门课的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShenWuIndex = 5;

        // 名字数组
        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShenWuIndex] = "生物";

        Scanner in = new Scanner(System.in);

        System.out.println("请问要保存几年的成绩？");

        int yearToStore = in.nextInt();

        // 创建成绩二维数组
        double[][] scores = new double[yearToStore][names.length];

        // 生成成绩数据
        for (int i = 0; i < yearToStore; i++) {
            for (int j = 0; j < names.length; j++) {
                scores[i][j] = Math.random() * 20 + 80;
            }
        }

        System.out.println("请输入你想查第几年的成绩？");

        int year = in.nextInt() - 1;

        System.out.println("请输入想查看的课程编号：");

        int scoreIndex = in.nextInt() - 1;

        System.out.println("第" + (year + 1) + "年的" + names[scoreIndex] + "成绩为" + scores[year][scoreIndex]);
    }
}
