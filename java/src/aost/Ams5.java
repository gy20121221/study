package aost;

import java.util.Scanner;

public class Ams5 {
    public static void main(String[] args) {


//有n个果冻排成一排.第I个果冻的美味度是ai.
//天使非常喜欢吃果冻，但她想把最好吃的果冻留到最后收藏.天使想知道前x个果冻中，美味度第二大的果冻有多少美味度？
//一共有Q次询问.
//注:如果最大的数有两个以上，默认第二大的等于最大的.例如，[2，3，4，2，4]这个例，第二大的数是4.

        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i]=scanner.nextInt();
        }
        arrp(ai);
        while (int a=scanner.nextInt())



    }

    private static void arrp(int[] ai) {

    }


}
