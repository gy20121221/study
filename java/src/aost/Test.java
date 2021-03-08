package aost;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Test {

    private static int f=1;
    private static Lock lock = new ReentrantLock();


    public static void main(String[] args) {
        //t1();
        t2();
        t3();
    }

    private static void t3() {
        f++;
        System.out.println(f);

    }

    private static void t2() {

        lock.lock();
        System.out.println(f);
        t3();
        lock.unlock();
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
