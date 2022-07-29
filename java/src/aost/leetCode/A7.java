package aost.leetCode;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/8/2 16:02
 */
public class A7 {
    public static void main(String[] args) {
//        System.out.println(new A7().isMatch1("aaa", "ab*a*c*a"));
        int[] arr = {3,2,1};
        int k = 2;
        System.out.println(Arrays.toString(new A7().getLeastNumbers(arr, k)));
    }
    /**
     * description  请实现一个函数用来匹配包含'.'和'*'的正则表达式。
     * 模式中的字符'.'表示任意一个字符，
     * 而'*'表示它前面的字符可以出现任意次（含0次）。
     * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。
     *
     * @author aost
     * @date 16:08 2022/1/10
     * param [s, p]
     * @return boolean
     */
    public boolean isMatch(String s, String p) {
        int j=0,i=0;
        for (; i < p.length()&&j<s.length(); i++) {
            if (p.charAt(i)==s.charAt(j)){
                j++;
            }else if (p.charAt(i)=='.'){
                j++;
            }else if (p.charAt(i)=='*'){
                while (s.charAt(j)==p.charAt(i-1)||p.charAt(i-1)=='.'){
                    j++;
                    if (s.length()>=j) {
                        break;
                    }
                }
            }
        }
        return s.length()==j&&p.length()==i;
    }
    public boolean isMatch1(String A, String B) {
        int n = A.length();
        int m = B.length();
        boolean[][] f = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                //分成空正则和非空正则两种
                if (j == 0) {
                    f[i][j] = i == 0;
                } else {
                    //非空正则分为两种情况 * 和 非*
                    if (B.charAt(j - 1) != '*') {
                        if (i > 0 && (A.charAt(i - 1) == B.charAt(j - 1) || B.charAt(j - 1) == '.')) {
                            f[i][j] = f[i - 1][j - 1];
                        }
                    } else {
                        //碰到 * 了，分为看和不看两种情况
                        //不看
                        if (j >= 2) {
                            f[i][j] |= f[i][j - 2];
                        }
                        //看
                        if (i >= 1 && j >= 2 && (A.charAt(i - 1) == B.charAt(j - 2) || B.charAt(j - 2) == '.')) {
                            f[i][j] |= f[i - 1][j];
                        }
                    }
                }
            }
        }
        return f[n][m];
    }

    /**
     * description  输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
     *       
     * @author aost
     * @date 16:21 2022/1/12
     * param [arr, k]
     * @return int[]
     */
    
    public int[] getLeastNumbers(int[] arr, int k) {
        return   Arrays.stream(arr).sorted().limit(k).toArray();
    }

}
