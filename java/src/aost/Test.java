package aost;

import java.util.HashMap;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        t1();

    }

    //输入一个字符串，输出该字符串中每一个字母的个数
    private static void t1() {
        Scanner scanner=new Scanner(System.in);
        String sc = scanner.next();
        char[] chars = sc.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        for (char a :
                chars) {
            if (map.containsKey(a)) {
                Integer integer = map.get(a);
                integer++;
                map.put(a,integer);
            }else {
                map.put(a,1);
            }
        }
        System.out.println(map);
    }
}
