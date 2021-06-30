public class BitCalc {
    public static void main(String[] args) {
        // binary: 1111 1000
        int a = 0xF8;
        // binary: 1111 0100
        int b = 0xF4;
        // binary: 1111 1111
        int c = 0xFF;

        System.out.println(a & b); // bitwise and: 1111 1100
        System.out.println(a | b); // bitwise or: 1111 0000
        System.out.println(a ^ b); // bitwise xor: 0000 1100
        System.out.println(~c);
    }
}
