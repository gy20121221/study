package aost;

import java.util.Arrays;

//可变差数,
public class Study8 {
    public static void main(String[] args) {
        System.out.println(add(10,20,10,30,50,55,55,84,88));
    }

    private static int add(int...arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        int s=0;
        for (int i :
                arr) {
            s+=i;
        }
        return s;
    }
}

/*
* 可变参数:是JDK1.5之后出现的新特性
使用前提:
当方法的参数列表数据类型已经确定 ,但是参数的个数不确定，就可以使用可变参数.
使用格式:定义方法时使用
修饰符返回值类型方法名(数据类型.. .变量名){}
可变参数的原理:
可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组,来存储这些参数
传递的参数个数,可以是e个(不传递),1,2...多个
*
* 可变参数的注意事项
1.一个方法的参数列表,只能有一-个可变参数
2.如果方法的参数有多个,那么可变参数必须写在参数列表的末尾

*/
