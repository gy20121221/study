package aost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//斗地主案例实现
public class Demo2 {
    public static void main(String[] args) {

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
