package aost.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/7/22 14:07
 */
public class A6 {


    /**
     * description  输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 前序 A BDFE CGHI    中序  DBEF  A  GHCI
     *
     * @author aost
     * date 14:08 2021/7/22
     * param [preorder, inorder]
     * return aost.leetCode.A6.TreeNode
     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        // 前序遍历中的第一个节点就是根节点
        int preorder_root = preorder_left;
        // 在中序遍历中定位根节点
        int inorder_root = indexMap.get(preorder[preorder_root]);

        // 先把根节点建立出来
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // 得到左子树中的节点数目
        int size_left_subtree = inorder_root - inorder_left;
        // 递归地构造左子树，并连接到根节点
        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // 递归地构造右子树，并连接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    
    /**
     * description  给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
     * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
     * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。 2 <= n <= 58
     * @author aost
     * time 0 100%  ram 70%
     * date 16:04 2021/7/27
     * param [n]
     * return int
     */

    public int cuttingRope(int n) {

        if (n==2) {return 1;}
        else if(n==3) {return 2;}
        int max=1;
        while (n>4){
            max*=3;
            max%=1000000007;
            n-=3;
        }
        return max*n%1000000007;
    }




    /**
     * description  给定一个n，求[1,n]这n个数字的排列组合有多少个。条件：相邻的两个数字的绝对值不能等于1
     * @author aost
     * date 9:08 2021/7/28
     * param [visit, result, n, last, size]
     * return void
     */

    public void getNum(int[] visit, int[] result,int n, int last, int size){

    }

    }

}
    