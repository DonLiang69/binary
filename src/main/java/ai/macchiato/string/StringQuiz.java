package ai.macchiato.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringQuiz {
    // quiz 1: Given a string, list out all the possible combination(does not include sequence)
    // e.g. ABC -> A B C AB AC BC ABC
    // FIXME e.g. ABCC -> A B C AB AC BC CC ABCC
    public static void q1() {
        Map binaryStr = new HashMap();
        binaryStr.put("A",0);
        binaryStr.put("B",1);
        binaryStr.put("C",2);

//        for(int i = 0; i < 3)


    }

    // quiz 2: find out the non-duplicated elements in the list
    // 1 1 2 2 3 4 4 -> 3
    // List intList = new ArrayList<Integer>();
    public static void q2(List<Integer> list) {
        int result = list.size() > 0 ? list.get(0) : -1;
        for (int i = 1; i < list.size(); i++) {
            result ^= list.get(i);
        }
        System.out.println(result);
    }

    // quiz 3: Define S can be divided by T when S = T + T + ... + T. Given a String S and T, determine if S can be divided by T;
    public static void q3(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int lengT = t.length();
//        int intS = charS
    }


    public static void main(String[] args) {
        List intList = new ArrayList<Integer>();
        intList.add(3);
        intList.add(2);
        intList.add(1);
        intList.add(1);
        intList.add(2);
        intList.add(4);
        intList.add(4);

//        q2(intList);
//        System.out.println(0 ^ 3);
        String a = "A";
        System.out.println(3 << 2);
        System.out.println();
//        System.out.println("A" ^ "B");
        int a2 = a.toCharArray()[0];
        System.out.println(a2);
    }

}
