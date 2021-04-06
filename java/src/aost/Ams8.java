package aost;

import java.util.Arrays;

public class Ams8 {
    public static void main(String[] args) {
        Ams8 a = new Ams8();
        a.greedy2();
    }

    /**
     * 贪心算法2：活动选择问题
     */
    public void greedy2() {
        int[] st = {1, 5, 0, 5, 3, 3, 6, 8, 8, 2, 12};
        int[] et = {4, 9, 6, 7, 8, 5, 10, 12, 11, 13, 14};
        int num = getNumber2(st, et);
        System.out.println("活动数量：" + num);
    }

    /**
     * 贪心算法2：活动选择问题
     */
    public int getNumber2(int[] a, int[] b)  //优先选择结束时间早的
    {
        int[][] ab = new int[a.length][2];
        int num = 0;
        int z;
        for (int i = 0; i < a.length; i++) {
            ab[i][0] = a[i];
            ab[i][1] = b[i];
        }
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
        System.out.println(Arrays.deepToString(ab));
        int endTime = ab[0][1];
        num++;
        for (int i = 1; i < a.length; i++) {
            if (ab[i][0] >= endTime) {
                endTime = ab[i][1];
                num++;
            }
        }
        return num;
    }
}
