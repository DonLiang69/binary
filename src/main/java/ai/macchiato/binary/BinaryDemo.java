package ai.macchiato.binary;

public class BinaryDemo {
//    因为第一位表示的是符号位.而使用补码表示时又可以多保存一个最小值。
    // byte 8
    // short 16
    // int 32
    // long 64


    //System.out.println() -> 10
    public static void main(String[] args) {
//        int i = 0111;
        byte i = 0b0000_1001;
        byte i2 = (byte) ~i;
        byte j = (byte) 0b1111_0111;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
//
//        printDecimal(i);
//        printDecimal(i2);
//        printDecimal(j);
//      1111 1111 1111 0111
        // -9 1000 0000 0000 1001
        // -9 1111 1111 1111 0110
        // -9 1111 1111 1111 0111
//        short x = (short) 0b1000_0000_0000_1001;

        boolean a = true;
        boolean b = true;

//        System.out.println((a ^ b));

        // 9: 0000 0000 0000 1001
        // -9 : 1000 0000 0000 1001

        // 9
        short x = (short) 0b0000_0000_0000_1001;
        // 6
        short y = (short) 0b0000_0000_0000_0110;

//        System.out.println(x & y);
        System.out.println(~y);



//        printDecimal(x);

    }

    public static void printDecimal(int i) {
        System.out.println(i);
    }

    public static void printBinary(byte i) {
        int j = Byte.toUnsignedInt(i);
        StringBuilder byteStr = new StringBuilder(Integer.toBinaryString(j));
        int byteStrLeng = byteStr.length();
        for (int x = 0; x < 8 - byteStrLeng; x++) {
            byteStr.insert(0, "0");
        }
        System.out.println(byteStr);
    }




}
