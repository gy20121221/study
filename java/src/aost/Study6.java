package aost;

import java.util.ArrayList;
import java.util.Collection;

public class Study6 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("aost");
        collection.add("q");
        collection.add("w");
        collection.add("e");
        collection.remove("q");
        System.out.println(collection);
        System.out.println(collection.size());
        Object[] objects=collection.toArray();
        for (Object a :
                objects) {
            System.out.println(a);
        }
        collection.clear();

    }
    /*
* 基本类型与字符串之间的转换
基本类型与字符串之间的转换
基本类型-- >字符串
基本类型-->字符串
1.基本类型数据的值+"”最简单的方式(工作中常用)
1.(基本类型数据的值+“”最简单的方式(工作中常用)
2.使用包装类中的静态方法
2.使用包装类中的静态方法
static String toString(int i)返回- -个表示指定整数的String 对象。
静态字符串到String(Int I)返回--个表示指定整数的字符串对象。
3.使用String类中的静态方法
3.使用字符串类中的静态方法
static String value0f(int i)返回int参数的字符串表示形式。
静态字符串值0f(Inti)返回int参数的字符串表示形式。
字符串-->基本类型
字符串-->基本类型
使用包装类的静态方法parseXX(”字符串")
使用包装类的静态方法ParseXX(“字符串”)
Integer类:
整数类：
static int parseInt(String s)
静态int parseInt(字符串s)
Double类:
双类：
static double parseDouble(String s)
静态双倍(字符串s)
*/



    /*
    * java. util. Collection接口
所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
任意的单列集合都可以使用Col lect ion接口中的方法
共性的方法：
public boolean add(E e):把给定 的对象添加到当前集合中。
public void clear() :清空集合中所有的元素。
public boolean remove(E e): 把给定的对象在当前集合中删除。 返回boolean 存在返回true
public boolean contoins(E e):判断当前集合中是否包含给定的对象。  存在返回true
public boolean isEmpty(): 判断当前集合是否为空。  为空返回true
public int size(): 返回集合中元素的个数。
public object[] taArray(): 把集合中的元素，存储到数组中。

*/
}
