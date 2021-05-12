package aost.ms;

import java.util.Arrays;

public class Ams7 {
    public static void main(String[] args) {
        int[] ints = {21, 15, 54, 8, 78, 78, 78, 98, 8, 78, 45, 44, 1, 2, 8, 6};
        System.out.println(Arrays.toString(ints));

        quick_sort(ints, 0, ints.length - 1);
//        kp(ints);

        System.out.println(Arrays.toString(ints));
//        kp(ints);
    }


    //快速排序
    private static void kp(int[] ints) {
        int low = 0, high = ints.length - 1;
        quick_sort2(ints, low, high);

    }

    //快速排序 大到小
    private static void quick_sort2(int[] ints, int low, int high) {
        if (low < high) {
            int k = ints[low], l = low, r = high;

            while (l < r) {
                while (l < r && ints[r] <= k) r--;
                if (l < r) ints[l++] = ints[r];

                while (l < r && ints[l] > k) l++;
                if (l < r) ints[r--] = ints[l];
            }
            ints[l] = k;

            quick_sort2(ints, l + 1, high);
            quick_sort2(ints, low, r - 1);
        }
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
