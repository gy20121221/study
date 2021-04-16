package aost;

import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class AText8 {
    public static void main(String[] args) {

    }

    public int characterReplacement (String str, int k) {
        // write code here
        int sum=0;
        int max=0;
        int min=0;
        char m=' ';
        HashMap<Character,Integer> hashMap=new HashMap<>();
        char[] chars=str.toCharArray();
        if (str.length()<=k) return str.length();
        for (char aChar : chars) {
            if (!hashMap.containsKey(aChar)){
                hashMap.put(aChar,0);
            }else {
                Integer integer = hashMap.get(aChar);
                integer++;
                hashMap.put(aChar,integer);
                if (integer>max) {
                    max=integer;
                    m=aChar;
                }
            }
        }
        if (str.length()-max<=k) return str.length();
        else  sum=max+k;



        for (int i = 0; i < k; ) {
            if (chars[i]!=m){
                k--;
                min++;
            }
        }



        return sum;

    }



/*// 判断平衡二叉树
    public boolean isBalanced (TreeNode node) {
        // write code here
        if(root == null){
            return 0;
        }
        int left = getDepth(root.left);
        if(left == -1){
            return -1;
        }
        int right = getDepth(root.right);
        if(right == -1){
            return -1;
        }
        return Math.abs(left-right)>1?-1:1+Math.max(left, right);
    }*/


}
