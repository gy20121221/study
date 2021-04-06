package aost;


import java.util.Arrays;
import java.util.Scanner;

// 3 2   4 5 1   9 5  100 40
//现在有n个怪物，每一个怪物有一定的血量，你手里有m只箭，每一只箭都有一个伤害值，同时也有一个花费。
// 我们现在假设每一只箭只能用一次并且每一个怪物也只能射一次，想要把所有怪物都击杀问最少需要花费多少，若无法全部击杀，则输出No。
//击杀的条件为：使用的这只箭的伤害大干等于怪物的血量，则就可以击杀。
//输入描述：
//第一行输入一个整数了，代表有T组测试数据。
//对于每一组测试数据，一行输入两个整数n和m，代表有n个怪物，m只接下来n个数，a（i）代表每一个怪物的血量，
// 接下来m个数，b（i）代表每一只箭的伤害：接下来m个数，c（i）代表每一只箭的花费。
//|1≤T≤10
//|1≤n，m≤100000
//1≤a[i]，b[i]，c[i]≤100000
//输出描述：
//对于每一组数据，输出一行，代表满障怪物的最少花费，若消除不了，输出NO
public class AText2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] A = new int[m];
            int[] B = new int[m];
            int[][] ab = new int[m][m];
            int z = 0, s = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                B[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                ab[i][0] = B[i];
                ab[i][1] = A[i];
            }

            if (n > m) System.out.println("NO");
            kp(a);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - 1 - i; j++) {
                    if (ab[j][1] > ab[j + 1][1]) {
                        z = ab[j][1];
                        ab[j][1] = ab[j + 1][1];
                        ab[j + 1][1] = z;

                        z = ab[j][0];
                        ab[j][0] = ab[j + 1][0];
                        ab[j + 1][0] = z;
                    }
                }
            }

            for (int i = 0, j = 0; i < n; i++) {
                if (j >= m) System.out.println("NO");
                while (a[i] > ab[j][1]) j++;
                s += ab[j][0];
            }
            System.out.println(s);
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





