package aost.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ams2 {
    public static void main(String[] args) {
//        小强有n个养鸡场，第i个养鸡场初始有a[i]只小鸡。与其他养鸡场不同的是，他的养鸡场每天增加k只小鸡，
//        小强每天结束都会在数量最多的养鸡场里卖掉一半的小鸡，假如一个养鸡场有x只鸡，则卖出后只剩下x/2(向下取整)只鸡。
//        问m天后小强的n个养鸡场一共多少只小鸡？
//        输入 第一行输入三个int类型n,m,k（1 <= n,m,k <= 10^6） 第二行输入n个正整数，表示n个养鸡场初始鸡的个数
//        输出 输出一个整数表示鸡的总数


        Scanner scanner = new Scanner(System.in);
        int n, m, k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        int max = 0, max1 = 0, max2 = 0, z = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            int j = scanner.nextInt();
            s += j;
            if (j > max) max = j;
            else if (j > max1) max1 = j;
            else if (j > max2) max2 = j;
        }
        for (int i = 0; i < m; i++) {
            z = (max + k) / 2;
            max = max - z;
            s = s + n * k - z;
            if (max < max1 && max < max2) ;
        }









     /*   尝试一
        Scanner scanner=new Scanner(System.in);
        int n,m,k;
        n=scanner.nextInt();
        m=scanner.nextInt();
        k=scanner.nextInt();
        int[] ints = new int[n];
        int s=0;
        for (int i = 0; i < n; i++) {
            ints[i]= scanner.nextInt();
        }
        MergeSort(ints);
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < ints.length; i1++) {
                ints[i1]+=k;
            }
            ints[0]=ints[0]/2;
            MergeSort(ints);
        }
        for (int anInt : ints) {
            s+=anInt;
        }
        System.out.println(s);*/


    }


    //冒泡排序 ,从大到小
    private static int[] arrP(int[] ints) {
        int t;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] < ints[j + 1]) {
                    t = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = t;
                }
            }
        }
        return ints;
    }

    /*归并排序 从小到大*/
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }

    /*归并排序——将两段排序好的数组结合成一个排序数组*/
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }


}
