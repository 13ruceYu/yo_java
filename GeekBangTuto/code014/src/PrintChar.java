public class PrintChar {
    public static void main(String[] args) {
        char ch = 'A';
        int chNum = ch;
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (chNum+i));
        }
    }
}
