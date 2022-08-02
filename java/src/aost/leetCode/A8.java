package aost.leetCode;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * description: TODO
 *
 * @author zhangpeng
 * @version 1.0
 * @date 2022/6/9 11:45
 */
public class A8 {
    public static void main(String[] args) {
        String[] strings={"a","b","c","d","e","f","g","l"};
        List<List<String>> permute = new A8().permute(strings);

        permute.forEach(System.out::println);

        System.out.println(permute.size());

    }


    /**
     * description  输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
     * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
     *
     * 链接：https://leetcode.cn/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof
     *
     * @author aost
     * @date 16:28 2022/6/10
     * param [pushed, popped]
     * @return boolean
     */

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : pushed) {
            stack.push(num); // num 入栈
            while(!stack.isEmpty() && stack.peek() == popped[i]) { // 循环判断与出栈
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

    /**
     * description  就是输出26个英文字母和0-9，总共36个字符，从里面取6个，不重复
     *       
     * @author aost
     * @date 12:37 2022/6/16
     * param [nums]
     * @return java.util.List<java.util.List<java.lang.String>>
     */
    
    public List<List<String>> permute(String[] nums) {
        List<List<String>> res = new ArrayList<>();

        List<String> output = new ArrayList<>(Arrays.asList(nums));

        int n = output.size();
//        int n = 6;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n, List<String> output, List<List<String>> res, int first) {
        // 所有数都填完了
        if (first == n) {
            res.add(new ArrayList<>(output));
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }

    /**
     * description   从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
     *
     * @author aost
     * @date 17:50 2022/7/28
     * param [root]
     * @return int[]
     */





}
