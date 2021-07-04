import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rangeStart = 30;
        int rangeEnd = 90;

        int mod = rangeEnd - rangeStart;

        int numberToGuess = rangeStart + (int)(Math.random() * mod);

        int totalChance = 5;

        System.out.println("游戏开始，请在"+rangeStart+"和"+rangeEnd+"之间，猜一个正确的数字，总共" + totalChance + "机会。");
        while (totalChance > 0) {
            System.out.println("剩余" + totalChance + "机会。" + "请输入本次猜测数字：");
            int val = input.nextInt();

            if (val == numberToGuess) {
                System.out.println("恭喜你，猜对了，正确答案是" + numberToGuess + "!");
                break;
            } else if (val > numberToGuess) {
                System.out.println("太大了，往小了猜。");
            } else {
                System.out.println("太小了，往大了猜。");
            }
            totalChance--;
        }
        System.out.println("游戏失败，正确答案为" + numberToGuess + "，输入 \" again \"，再来一局。");
    }
}
