package aost.leetCode;

import java.util.Arrays;

/**
 * @ClassName: a3
 * @Description: 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @Author aost
 * @Date 2021/5/15
 * @Version 1.0
 */

public class A3 {
    public static void main(String[] args) {

    }
    /**
     * @Author aost
     * @Description 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * @Date  2021/5/15
     * @Param [nums, k]
     * @Return void
     * @MethodName rotate
     */
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] rightward = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(rightward, 0, nums, 0, k);
    }
}
