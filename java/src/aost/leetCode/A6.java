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
     *              假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     *              前序 A BDFE CGHI    中序  DBEF  A  GHCI
     * @author aost
     * date 14:08 2021/7/22
     * param [preorder, inorder]
     * return aost.leetCode.A6.TreeNode
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }



    public Map<Integer,Integer> map= new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int  rootVal=preorder[0],inorderRoot=0;
        TreeNode root=new TreeNode(rootVal);
        TreeNode temL=new TreeNode(0);
        TreeNode temR=new TreeNode(0);
        for (int i = 0; i < inorder.length; i++) {
            if (rootVal==inorder[i]) {
                inorderRoot=i;
            }

        }
        ArrayList<Integer>  left=new ArrayList<>();
        ArrayList<Integer>  right=new ArrayList<>();

        for (int i = 0; i < inorder.length; i++) {
            if (i<inorderRoot) {
                left.add(inorder[i]);
            }else if(i>inorderRoot) {
                right.add(inorder[i]);
            }
        }

        for (int i = 1; i < preorder.length; i++) {
            if (root.left==null&& isExist(left,preorder[i])){

            }


        }
        return  root;

    }







    public boolean isExist(ArrayList<Integer> param,int x){
        for (Integer integer : param) {
            if (integer==x) {return true;}
        }
        return  false;
    }









}
