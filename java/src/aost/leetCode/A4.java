package aost.leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author aost
 * @version 1.0
 * @description: 
 * @date 2021/7/14 10:09
 */
public class A4 {
    public static void main(String[] args) {

//        System.out.println(sumNums(10));
        int[] ints={1,2,3,4,5,6,7,8,8,9,4,5,3,5};

        System.out.println(findRepeatNumber(ints));
    }

    /**
     * description  输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * author aost
     * date 11:03 2021/7/14
     * param []
     * return void
     */

    public static String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for(String s : strs) {
            res.append(s);
        }
        return res.toString();
    }

    /**
     * description  求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     * author aost
     * date 10:27 2021/7/14
     * param []
     * return void
     */
    static int[] test=new int[]{0};
    public static int sumNums(int n) {
        try{
            return test[n];
        }catch(Exception e){
            return n+sumNums(n-1);
        }
    }


    /**
     * description  在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * @author aost
     * date 16:43 2021/7/19
     * param [nums]
     * return int
     */

    public static int findRepeatNumber1(int[] nums) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(nums[0]);
            for (int i = 1; i < nums.length; i++) {
                for (Integer integer : list) {
                    if (integer==nums[i]){return nums[i];}
                }
                list.add(nums[i]);
            }
        return 0;
    }

    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }



    /**
     * description   在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @author aost
     * 0  time 6 9%  ram  99%
     * * 1  time 0 100%  ram  50%
     * date 17:27 2021/7/19
     * param [matrix, target]
     * return boolean
     */

    public boolean findNumberIn2dArray(int[][] matrix, int target) {
       Set<Integer> set=new HashSet<>();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                set.add(anInt);
                if (set.contains(target)){ return true;}
            }
        }
       return false;
    }


    public boolean findNumberIn2dArray1(int[][] matrix, int target) {
        int q=matrix.length-1,w=0;
        while (q>=0&&w<matrix[0].length){
            if (matrix[q][w]>target){q--;}
            else if (matrix[q][w]<target){w++;}
            else {
                return true;
            }
        }
        return false;
    }



    /**
     * description  一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n级的台阶总共有多少种跳法。
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     * @author aost
     * time 0  100% ram 94%
     * date 11:09 2021/7/20
     * param [n]
     * return int
     */
    public int numWays(int n) {
        if (n<=1) { return 1; }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i = 2; i < n+1; i++){
            dp[i] = (dp[i-1] + dp[i-2])%1000000007;
        }
        return dp[n];
    }


    /**
     * description  把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
     * @author aost
     * time 0  100%  ram  17%
     * date 11:25 2021/7/20
     * param [numbers]
     * return int
     */

    public int minArray(int[] numbers) {
        if (numbers.length<=1) {return numbers[0];}
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i-1]>numbers[i]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }







}
