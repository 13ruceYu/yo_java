import java.util.Scanner;

public class Example {
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
                System.out.println("第" + (i + 1) + "年" + names[j] + "成绩为：" + scores[i][j]);
            }
        }

        while (true) {
            System.out.println("请输入要进行操作的编号");
            System.out.println(
                    "1. 求某年最好成绩\n" + "2. 求某年平均成绩\n" + "3. 求所有年份最好成绩\n" + "4. 求某门课历年最好成绩"
            );

            int oprtId = in.nextInt();
            int year = 0;

            switch (oprtId) {
                case 1:
                    System.out.println("请输入要求哪一年的最好成绩：");
                    year = in.nextInt() - 1;
                    if (year < 0 || year >= yearToStore) {
                        System.out.println("非法的年份！");
                    }
                    int bestOfYearScoreId = 0;
                    for (int i = 0; i < names.length; i++) {
                        if (scores[year][i] > scores[year][bestOfYearScoreId]) {
                            bestOfYearScoreId = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年最好成绩为" + names[bestOfYearScoreId] + ":" + scores[year][bestOfYearScoreId]);
                    break;
                case 2:
                    System.out.println("请输入要求哪一年的平均成绩：");
                    year = in.nextInt() - 1;
                    if (year < 0 || year >= yearToStore) {
                        System.out.println("非法的年份！");
                    }
                    double totalScore = 0;
                    for (int i = 0; i < names.length; i++) {
                        totalScore += scores[year][i];
                    }
                    System.out.println("第" + (year + 1) + "年的平均成绩为" + totalScore / names.length);
                    break;
                case 3:
                    double bestScore = 0;
                    int theYear = 0;
                    for (int i = 0; i < yearToStore; i++) {
                        for (int j = 0; j < names.length; j++) {
                            double curScore = scores[i][j];
                            if (curScore > bestScore) {
                                bestScore = curScore;
                                theYear = i;
                            }
                        }
                    }
                    System.out.println("最好的成绩为" + bestScore + "，在第" + (theYear + 1) + "年。");
                    break;
                case 4:
                    System.out.println("请输入想要求的课程的编号：");
                    int nameIndex = in.nextInt() - 1;
                    if (year < 0 || year >= names.length) {
                        System.out.println("非法的课程编号！");
                    }
                    double bScore = 0;
                    int yearIn = 0;
                    for (int i = 0; i < yearToStore; i++) {
                        if (scores[i][nameIndex] > bScore) {
                            bScore = scores[i][nameIndex];
                            yearIn = i;
                        }
                    }
                    System.out.println(names[nameIndex] + "的最好成绩为 " + bScore + " 在第" + (yearIn + 1) + "年。");
                    break;
                default:
            }
        }
    }
}
