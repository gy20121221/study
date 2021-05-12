package aost.ms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.Integer.max;

public class AText {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int i = scanner.nextInt();
        String n = scanner.next();
        System.out.println(findCode(i, n));*/


//        int n=scanner.nextInt();
//        String m = scanner.next();
//        String w = scanner.next();
//        String l = scanner.next();
//        System.out.println(findWin(n,m, w, l));
        String s = "qwqwqwqwaaqwq";
        System.out.println(mathW(s));


    }

    private static String findWin(int n, String m, String w, String l) {
        if (n >= m.length() || n >= w.length() || n >= l.length()) return "draw";
        int m1 = mathW(m);
        int w1 = mathW(w);
        int l1 = mathW(l);
        int s = m.length();
        int win = 0;
        if (m1 + n >= s) ++win;
        if (w1 + n >= s) ++win;
        if (l1 + n >= s) ++win;

        if (win >= 2) return "draw";
        else {
            if (m1 > w1 && m1 > l1) return "ming";
            else if (w1 > m1 && w1 > l1) return "wang";
            else return "li";
        }
    }


    //输出字符串中的最大字母个数
    public static int mathW(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) hashMap.put(s.charAt(i), 1);
            else {
                Integer integer = hashMap.get(s.charAt(i));
                ++integer;
                hashMap.put(s.charAt(i), integer);
            }
        }
        Collection<Integer> values = hashMap.values();
        for (Integer value : values) {
            max = Math.max(max, value);
        }
        return max;
    }



/*    private static int findCode(int i,String n) {
        char[] ns=n.toCharArray();
        int i1=i/2;
        int n0=0,n1=0;
        int s0,s1=0;
        for (int j = 0; j < i; j++) {
            if (ns[j]=='1'){
                n1++;
                if (j>=i1){
                    ns[j]=0;
                    s1++;
                }
            }
            else {
                n0++;
                if (j<i1){
                    ns[j]=1;
                    s1++;
                }
            }
        }
        s0 = Math.min(n0, n1);
        return Math.min(s0,s1);
    }*/




}