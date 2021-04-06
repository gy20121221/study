package aost;

import java.util.Objects;

/**
 * @author 嘿嘿
 */
public class Study3 {
    public static void main(String[] args) {


        //String的各种构造方法
        String str1 = new String("abc");
        String str11 = "abc";
        String str12 = "abc";
        System.out.println(str1);

        char[] charArr = {'a', 'b', 'c'};
        String str2 = new String(charArr);
        System.out.println(str2);

        byte[] byteArr = {97, 98, 99};
        String str3 = new String(byteArr);
        System.out.println(str3);


        //比较字符串内容equals
        //用普通方法生成的字符串是调用常量地址，即内容一样则地址一样
        System.out.println(str11 == str12);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        //==比较的是字符串的地址
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("abc".equals(str1));
        System.out.println("ABC".equalsIgnoreCase(str1));
        //equalsIgnoreCase忽略大小写

        /*String当中与获取相关的常用方法有:
        public int length(): 获取字符串当中含有的字符个数，拿到字符串长度。
        public String concat(String str); 将当前字符串和参数字符串拼接成为返回值新的字符串。
        public char charAt(int index): 获取指定索引位置的单个字符。 (索引从开始。)
        public int indexOf(String str): 查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
*/

        System.out.println("dadsaad".length());
        String strA = str1.concat(str3);
        //concat不会改变原来字符串
        System.out.println(strA);
        System.out.println(str1.charAt(2));
        System.out.println("helloworld".indexOf("l"));

        //截取 (x,y]
        System.out.println("hello".substring(2, 5));

/*      public char[] toCharArray(): 将当前字符串拆分成为字符数组作为返回值。
        public byte[] getBytes(): 获得当前字符串底层的字节数组。
        public String replace(CharSequence oldString, CharSequence newString):
*/

        char[] chars = "hello".toCharArray();
        System.out.println(chars[2]);
        byte[] bytes = "heloo".getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        String str4 = "cnm,nmbiss";
        System.out.println(str4.replace("nm", "**"));

/*
        分割字符串的方法:
        public String[] split(String regex): 按照参数的规则，将字符串切分成为若干部分。
*/
        String str5 = "aa,b.b,cc";
        String[] split1 = str5.split(",");
        for (String a :
                split1) {
            System.out.println(a);
        }
        String[] split2 = str5.split("//.");
        // .在正则表达式中有特殊含义，必须用//.转义
        for (String a :
                split2) {
            System.out.println(a);
        }

        //1
        System.out.println("@@@");
        String[] strings = {"q", "w", "e"};
        System.out.println(stringsLink(strings));


        //2
        String str6 = "dsad@#@244esr41SAA4";
        stringType(str6);

    }

/*
    1,定义-一个方法，把数组{1,2, 3}按照指定格式拼接成- 个字符串。格式参照如下: [word1#word2#word3]。
*/

    public static String stringsLink(String[] a) {
        StringBuilder s = new StringBuilder();
        for (String n :
                a) {
            if (!Objects.equals(n, a[a.length - 1])) {
                s.append(n).append("#");
            } else {
                s.append(n);
            }
        }
        return s.toString();
    }

/*
    2,键盘输入一个字符串，并且统计其中各种字符出现的次数。
    种类有:大写字母、小写字母、数字、其他
*/

    public static void stringType(String string) {
        int wA = 0;
        int wa = 0;
        int wn = 0;
        int wnth = 0;
        char[] chars = string.toCharArray();

        for (char aChar : chars) {
            if ('A' <= aChar && 'Z' >= aChar) {
                wA++;
            } else if ('a' <= aChar && 'z' >= aChar) {
                wa++;
            } else if ('0' <= aChar && '9' >= aChar) {
                wn++;
            } else {
                wnth++;
            }
        }
        System.out.println("大写字母:" + wA + "小写字母:" + wa + "数字:" + wn + "其他:" + wnth);
    }


}
