public class BooleanOprt {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        System.out.println(a | b);
        System.out.println(a || b);
        System.out.println(a & b);
        System.out.println(a && b);
        System.out.println(b || (10 / 0) > 3);
        System.out.println(b | (10 / 0) > 3);
    }
}
