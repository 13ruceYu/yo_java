public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 9999;
        intVal = (int) longVal;
        System.out.println(intVal);

        int a = 64;
        char b = (char) a;
        System.out.println(b);
    }
}
