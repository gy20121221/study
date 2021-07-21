package aost.leetCode;


/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/7/21 9:01
 */
public class A5 {

    public static void main(String[] args) {

    }


    /**
     * description  请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     * @author aost
     * time 0 100%  arm  43%
     * date 9:02 2021/7/21
     * param [s]
     * return java.lang.String
     */

    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c==' ') {stringBuilder.append("%20");}
            else  {stringBuilder.append(c);}
        }

        return stringBuilder.toString();
    }

}
