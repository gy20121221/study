package aost;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Ams12 {
    public static void main(String[] args) {

//        getLongestPalindrome("qwqwqwqwqwqaaasawqadasdaw", 25);

        System.out.println(isValid("(){(())}"));
    }


    //给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
    public static int maxLength(int[] arr) {
        // write code here
        LinkedList<Integer> list = new LinkedList<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                int j = list.indexOf(arr[i]);
                while (j-- >= 0) {
                    list.removeFirst();
                }
            }
            list.add(arr[i]);
            ans = Math.max(ans, list.size());
        }
        return ans;
    }


    //给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
    public static int[] twoSum(int[] numbers, int target) {
        // write code here
        int[] a = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int y = target - numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == y && i != j) {
                    a[0] = Math.min(i, j) + 1;
                    a[1] = Math.max(i, j) + 1;
                    return a;
                }
            }

        }
        return a;
    }


    //对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。
    public static int getLongestPalindrome(String A, int n) {
        // write code here
        // 第 i 个字符到第 j 个字符是否是回文串
        boolean[][] dp = new boolean[n][n];
        int max = 0;
        // 字符串首尾字母长度差 (d = j-i)
        for (int d = 0; d < n; d++) {
            // 字符串起始位置 i
            for (int i = 0; i < n - d; i++) {
                // 字符串结束位置 j
                int j = i + d;
                // 如果字符串 i 到 j 的首尾相等，再根据字符串 i-1 到 j-1 来确定，即得到递推公式
                if (A.charAt(i) == A.charAt(j)) {
                    if (d == 0 || d == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j]) {
                        // 更新最大长度
                        max = Math.max(max, d + 1);
                    }
                }
            }
        }
        return max;
    }


    //给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
    //括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
    public static boolean isValid(String s) {
        // write code here
        Stack<Character> stack = new Stack<Character>();
        //使用foreach循环
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    //大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
    public int Fibonacci(int n) {
        int preNum=1;
        int prePreNum=0;
        int result=0;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2;i<=n;i++){
            result=preNum+prePreNum;
            prePreNum=preNum;
            preNum=result;
        }
        return result;

    }


}
