package aost.leetCode;

/**
 * @ClassName: a1
 * @Description: 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * @Author aost
 * @Date 2021/5/12
 * @Version 1.0
 */
public class A1 {
    /**
     * @Author aost
     * @Description 删除排序数组中的重复项
     * @Date  2021/5/12
     * @Param [nums]
     * @Return int
     * @MethodName removeDuplicates
     */
    public int removeDuplicates(int[] nums) {
        int left=0;
        if (nums.length == 0) {
            return 0;
        }
        for (int right=1; right < nums.length; right++) {
            if (nums[left]!=nums[right]) {
                nums[++left]=nums[right];
            }
        }
            return ++left;
    }
}
