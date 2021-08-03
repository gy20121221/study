package aost.ms;

import java.util.Scanner;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/8/2 10:41
 */
public class AText9 {
    /**
     * description  对于分数Xi / Yi ，我们给T组数据，n表示每组数据有n个分数，让这些分数相加看是否能等于一个整数，
     * 如果相加为整数返回Yes，否则返回No。
     * @author aost
     * date 10:42 2021/8/2
     * param [args]
     * return void
     */

    public static int t;
    public static int n;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        t = scanner.nextInt();
        n=scanner.nextInt();
        int[][] ints=new int[n][2];
        while (t>0){
            for (int i = 0; i < n; i++) {
                ints[i][0]=scanner.nextInt();
                ints[i][1]=scanner.nextInt();
            }
            System.out.println();
            isInt(ints);
            t--;
        }

    }
    public static void isInt(int[][] ints) {
        int fm=1,fz=0;
        for (int i = 0; i < n; i++) {
            if (fm%ints[i][1]!=0){
                fm*=ints[i][1];
                fz=(fz*ints[i][1])+((fm/ints[i][1])*ints[i][0]);
            }else {
                fz+=(fm/ints[i][1])*ints[i][0];
            }

        }
        if (fz==fm) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }



}
