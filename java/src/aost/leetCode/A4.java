package aost.leetCode;

import java.util.Arrays;

/**
 * @author aost
 * @version 1.0
 * @description: 
 * @date 2021/7/14 10:09
 */
public class A4 {
    public static void main(String[] args) {

        System.out.println(sumNums(10));
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




}
