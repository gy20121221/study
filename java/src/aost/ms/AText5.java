package aost.ms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class AText5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ints=new int[n];
        for (int i = 0; i < n; i++) {
            ints[i]=scanner.nextInt();
        }
        kp(ints);
        int s=0,r=0,l=0;
        int[] dan=new int[n];
        int[] sh=new int[n];
        int q=0,w=0;
        for (int i = 0; i < n; i++) {
            if (ints[i]%2==0) {
                sh[q]=ints[i];
                q++;
            }else {
                dan[w]=ints[i];
                w++;
            }
        }

        LinkedList<Integer> list=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        for (int i : sh) {
            list.push(i);
        }
        for (int i : dan) {
            list2.push(i);
        }

        while (!list.isEmpty()){
            if (r==0){
                r=list.pollFirst();
            }else if (list.contains(r)){

            }


        }










    }




    //快速排序
    private static void kp(int[] ints) {
        int low = 0, high = ints.length - 1;
        quick_sort(ints, low, high);
    }

    //快速排序 小到大
    public static void quick_sort(int[] s, int l, int r) {
        if (l < r) {
            int i = l, j = r, x = s[l];
            while (i < j) {
                // 从右向左找第一个小于x的数
                while (i < j && s[j] >= x) j--;

                if (i < j) s[i++] = s[j];

                // 从左向右找第一个大于等于x的数
                while (i < j && s[i] < x) i++;

                if (i < j) s[j--] = s[i];
            }
            s[j] = x;

            // 递归调用
            quick_sort(s, l, i - 1);
            quick_sort(s, i + 1, r);
        }
    }
}
