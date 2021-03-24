package ai.macchiato.binary;

public class BinaryQuiz {

    // 3.5
    // Quiz 1:. print out # among [1, 100] that can be divided by 2;
    public static void q1() {
        for (int i = 1; i < 1001; i++) {
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }

//            if (i % 2 == 0) {
//                System.out.println(i + " ");
//            }
        }
    }

    // Quiz 2:. print out # among [1, 1000] that is any power of 2;

    public static void q2() {
        for (int i = 1; i < 1001; i++) {
            if ((i & -i) == i) {
                System.out.print(i + " ");
            }
        }
    }

    // 3.13
    // Quiz 3: Write a function that takes an integer(32 bits) and returns the number of '1' bits it has
    // (also known as the Hamming weight). 汉明重量
//    Input: n = 00000000000000000000000000001011
//    Output: 3
//    Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
    public static void q3(int n) {
        int c = 0;
        for(int i=0; i<32;i++){
            int a = (n>>i)&1;
            if(a == 1){
                c++;
            }
        }
        System.out.println(c);
    }

    // 3.13
    // Quiz 4: Write a function that print the reverse of an integer(32 bits);
//    Input: n = 00000000000000000000000000001011
//    Output: 11010000000000000000000000000000

    //    Input: n = 00000000000000000000000000001001
    //    Output: 10010000000000000000000000000000
    public static int q4(int n) {
        int bitChecker = 1;
        int number = 0;
        for(int i = 0; i < 32; i++){
            if ((bitChecker & n) == bitChecker) {
                number += (1 << (31 - i));
            }
            bitChecker <<= 1;
        }
        return number;
    }

    public static void a() {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 1001; i++) {
            if (isPowerOf2(i)) {
                System.out.print(i + " ");
            }
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start + " ms");
    }

    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans | (n & 1);
//            ans += (n & 1);
            n >>= 1;
        }
        return ans;
    }

    public static boolean isPowerOf2(int x) {
        if (x == 1) {
            return true;
        } else if (x % 2 == 1) {
            return false;
        } else {
            return isPowerOf2(x / 2);
        }
    }

    public int hammingWeight(int n) {
        int bitChecker = 1;
        int total = 0;
        for (int i = 0; i < 32; i++) {
            if ((bitChecker & n) == bitChecker) {
                total++;

            }
            bitChecker <<= 1;
        }
        return total;
    }

    public static void main(String[] args) {
        ;
        System.out.println(Integer.toBinaryString(q4(0b00010000100000000000000000001011)));
//        -805306104

//        Integer.toBinaryString("-805306104");

        System.out.println(Integer.toBinaryString(reverseBits(0b00010000100000000000000000001011)));
    }
}
