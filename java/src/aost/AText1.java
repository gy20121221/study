package aost;

import java.util.Scanner;

public class AText1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        while (n>0){
            String next = scanner.next();
            toT(next);
            --n;
        }
    }

    //1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
    //2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
    //3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC
    private static void toT(String s) {
        char[] chars = s.toCharArray();//将传入的String型数据转化为char[];
        StringBuilder stringBuilder = new StringBuilder();//创建一个Builder对象接收char[]字符串
        int k = 0;
        for (int i = 0;i < chars.length; i++){
            chars[k] = chars[i];
            stringBuilder.append(chars[k]);//将第k个字符append到Builder
            k++;
            //实现第一个条件
            if (k >= 3 && chars[k-3] == chars[k-2] && chars[k-3] == chars[k-1]){
                stringBuilder.deleteCharAt(k-1);//删除不符合的字符
                k--;
            }
            //实现第二个条件
            if (k >= 4 && chars[k-4] == chars[k-3] && chars[k-2] == chars[k-1]){
                stringBuilder.deleteCharAt(k-1);
                k--;
            }
        }
        System.out.println(stringBuilder);

    }


}
