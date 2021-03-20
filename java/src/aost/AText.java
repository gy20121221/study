package aost;

import java.util.Scanner;

public class AText {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*int i = scanner.nextInt();
        String n = scanner.next();
        System.out.println(findCode(i, n));*/


        int n=scanner.nextInt();
        String m = scanner.next();
        String w = scanner.next();
        String l = scanner.next();
        System.out.println(findWin(n,m, w, l));


    }

    private static String findWin(int n,String m,String w,String l) {
        if (n>=m.length()) return "draw";


        return "";
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

/*    public long findMaxButtons (int[] buttons) {
        // write code here
        




    }*/


}