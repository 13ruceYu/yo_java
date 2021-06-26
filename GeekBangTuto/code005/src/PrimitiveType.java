public class PrimitiveType {
    public static void main(String[] args) {
        // byte 1 byte [-128, 127]
        byte byteVar = 127;
        System.out.println(byteVar);

        // short 2 byte [-32768, 32767]
        short shortVar = 32767;
        System.out.println(shortVar);

        // int 4 byte [-2 147 483 648, 2147483647] 21 亿 twenty-one billion
        int intVar = 33432334;
        System.out.println(intVar);

        // long 8 byte []
        long longVar = 21000000000L;
        System.out.println(longVar);

        // float 4 byte
        float floatVar = 12222.12345F;
        System.out.println(floatVar);

        // double 8 byte
        double doubleVar = 12345678.9999D;
        System.out.println(doubleVar);

        // boolean 1 bit
        boolean booleanVar = false;
        System.out.println(booleanVar);

        // char 2 byte
        char charVar = 'B';
        System.out.println(charVar);

        // String a sequence of characters
        String stringVar = "ABC";
        System.out.println(stringVar);
    }
}
