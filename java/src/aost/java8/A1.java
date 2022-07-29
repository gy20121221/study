package aost.java8;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/7/14 18:49
 */
public class A1 {

    public static void main(String[] args) {
//        lombok();
//        lombok1();
/*        ArrayList<Character> a=new ArrayList<>();
        ArrayList<Character> error=new ArrayList<>();


        for (char t = 'a'; t <= 'z'; t++) {
            a.add(t);
        }
        for (char t = 'a'; t < 'z'; t++) {
            error.add(t);
        }
        System.out.println(a(a, error));*/
        for (int i = 0; i < 100; i++) {
            System.out.println(luck(10000000));
        }

        System.out.println("总输次数"+s);


    }

    private static void lombok1() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        Optional<String> longest = stream.reduce((s1, s2) -> s1.length()>=s2.length() ? s1 : s2);
        System.out.println(longest.filter(String::isEmpty));

    }

    private static void lombok() {

        String[] stars= {"1", "2", "121", "32", "2", "3", "5", "2"};
        Arrays.sort(stars, (x, y) -> (x + y).compareTo(y + x));
        for (String star : stars) {
            System.out.println(star);
        }

        Arrays.stream(stars).sorted((x,y)->(x + y).compareTo(y + x)).forEach(System.out::println);
    }

    public static String a(ArrayList<Character> list,ArrayList<Character> error){
        return  list.stream().filter(s -> !error.contains(s)).toArray()[0].toString();
    }

    static int s=0;

    public static int luck(int l){
        int number=100;
        for (int i = 0; i < 10000; i++) {
            if (l>=number){
                if (Math.random()>0.5) {
                    l+=number;
                    number=100;
                }else {
                    l-=number;
                    number=2*number;
                }
            }else {
                s++;
                System.out.println("输了"+i);
                break;
            }
        }
        return l;
    }


}
