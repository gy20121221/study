package aost.ms;

import java.util.Scanner;

public class AText3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0, m0 = 0;
        int[] a = new int[n];
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if (a[i] > max) max = a[i];
            if (a[i] == 0) m0++;
        }
        for (int i : a) {
            if (i == max) m++;
        }

        int t = n - m;
        if (max == 0) System.out.println(1);
        else {
            while ((t * max - sum) <= sum) {
                max++;
            }
        }
        System.out.println(max);

    }
}
