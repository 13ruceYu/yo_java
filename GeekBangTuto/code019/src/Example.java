public class Example {
    public static void main(String[] args) {
        // 每门可对应的索引
        int Chinese = 0;
        int Mathematics = 1;
        int English = 2;
        int Physics = 3;
        int Chemistry = 4;
        int Biology = 5;

        int totalScoreCount = 6;
        double[] scores = new double[totalScoreCount];
        String[] scoreNames = new String[totalScoreCount];

        scoreNames[Chinese] = "语文";
        scoreNames[Mathematics] = "数学";
        scoreNames[English] = "英语";
        scoreNames[Physics] = "物理";
        scoreNames[Chemistry] = "化学";
        scoreNames[Biology] = "生物";

        for (int i = 0; i < totalScoreCount; i++) {
            scores[i] = 80 + Math.random() * 20;
            System.out.println(scoreNames[i] + "的成绩是：" + scores[i]);
        }

        double maxScore = 0;
        int maxScoreIndex = -1;

        for (int i = 0; i < totalScoreCount; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }

        System.out.println("最好的科目是：" + scoreNames[maxScoreIndex] + "；成绩为：" + maxScore);
    }
}
