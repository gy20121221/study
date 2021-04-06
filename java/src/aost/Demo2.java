package aost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//斗地主案例实现
public class Demo2 {
    public static void main(String[] args) {
        //arr();
        map();
    }

    private static void map() {
        //牌库
        String[] h = {"♠", "♣", "♥", "♦"};
        String[] s = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


        //创建索引
        HashMap<Integer, String> paiMap = new HashMap<>();
        ArrayList<Integer> integers = new ArrayList<>();
        Integer in = 0;

        integers.add(in);
        paiMap.put(in, "大王");
        in++;
        integers.add(in);
        paiMap.put(in, "小王");
        in++;

        for (String s3 : s) {
            for (String h1 : h) {
                paiMap.put(in, h1 + s3);
                integers.add(in);
                in++;
            }
        }


        System.out.println(paiMap);


        //洗牌
        Collections.shuffle(integers);

        //玩家
        ArrayList<Integer> w1 = new ArrayList<>();
        ArrayList<Integer> w2 = new ArrayList<>();
        ArrayList<Integer> w3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();


        for (int i = 0; i < integers.size(); i++) {
            Integer ins = integers.get(i);
            if (i < 51) {
                if (i % 3 == 0) {
                    w1.add(ins);
                } else if (i % 3 == 1) {
                    w2.add(ins);
                } else {
                    w3.add(ins);
                }
            } else diPai.add(ins);
        }

        Collections.sort(w1);
        Collections.sort(w2);
        Collections.sort(w3);
        Collections.sort(diPai);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(diPai);

//        String[] name={"周星驰","lbw","周润发","底牌"};
        kanpai("周星驰", paiMap, w1);
        kanpai("lbw", paiMap, w2);
        kanpai("周润发", paiMap, w3);
        kanpai("底牌", paiMap, diPai);


    }

    private static void kanpai(String name, HashMap<Integer, String> map, ArrayList<Integer> list) {
        System.out.print(name + ":");
        for (Integer i :
                list) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
    }


    private static void arr() {
        //牌库
        String[] h = {"♠", "♣", "♥", "♦"};
        String[] s = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList<String> sz = new ArrayList<>(Arrays.asList(s));
        ArrayList<String> hs = new ArrayList<>(Arrays.asList(h));
        ArrayList<String> pai = new ArrayList<>();

        //创建牌库
        for (String s1 :
                hs) {
            for (String s2 :
                    sz) {
                pai.add(s1 + s2);
            }
        }
        pai.add("大王");
        pai.add("小王");

        //洗牌
        Collections.shuffle(pai);

        //玩家
        ArrayList<String> w1 = new ArrayList<>();
        ArrayList<String> w2 = new ArrayList<>();
        ArrayList<String> w3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();


        for (int i = 0; i < pai.size(); i++) {
            String j = pai.get(i);
            if (i < 51) {
                if (i % 3 == 0) {
                    w1.add(j);
                } else if (i % 3 == 1) {
                    w2.add(j);
                } else {
                    w3.add(j);
                }
            } else diPai.add(j);
        }

        System.out.println("周星驰" + w1);
        System.out.println("lbw" + w2);
        System.out.println("周润发" + w3);
        System.out.println("底牌" + diPai);
    }


}
