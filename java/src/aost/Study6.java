package aost;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Collection集合，迭代器*/
public class Study6 {
    public static void main(String[] args) {
        s1();
        s2();
        s3();
        s4();
        Collection<String> collection = new ArrayList<>();
        collection.add("qwq");
        collection.add("qw");
        collection.add("w");
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(1);
        collection1.add(3);
        collection1.add(1);
        s5(collection);
        s5(collection1);
    }

    //泛型的通配符？的使用
    private static void s5(Collection<?> arrayList) {
        for (Object o :
                arrayList) {
            System.out.println(o);
        }
    }

    //泛型的使用方法
    private static void s4() {
        Study6Test<String> study6Test = new Study6Test<>();
        study6Test.setId("qwq");
        System.out.println(study6Test.getId());
        Study6Test<String> s2 = new Study6Test<>();
        s2.method("泛型方法");
        Study6IL<String> s3 = new Study6IL<>();
        s3.method("接口泛型");
    }

    //创建集合对象，使用泛型
    private static void s3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("qwe");
        for (String s :
                list) {
            System.out.println(s + s.length());
        }
    }

    public static void s1() {
        Collection<String> collection = new ArrayList<>();
        collection.add("aost");
        collection.add("q");
        collection.add("w");
        collection.add("e");
        collection.remove("q");
        System.out.println(collection);
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        for (Object a :
                objects) {
            System.out.println(a);
        }
        collection.clear();
    }

    public static void s2() {
        Collection<String> collection = new ArrayList<>();
        collection.add("zf");
        collection.add("af");
        collection.add("qf");
        collection.add("bf");
        Iterator<String> it = collection.iterator();
        boolean a = it.hasNext();
        System.out.println(a);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
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
任意的单列集合都可以使用Collection接口中的方法
共性的方法：
public boolean add(E e):把给定 的对象添加到当前集合中。
public void clear() :清空集合中所有的元素。
public boolean remove(E e): 把给定的对象在当前集合中删除。 返回boolean 存在返回true
public boolean contoins(E e):判断当前集合中是否包含给定的对象。  存在返回true
public boolean isEmpty(): 判断当前集合是否为空。  为空返回true
public int size(): 返回集合中元素的个数。
public object[] taArray(): 把集合中的元素，存储到数组中。
*/


/*
* java. util. Iterator接口:迭代器(对集合进行遍历)
有两个常用的方法
boolean hasNext() 如果仍有元素可以迭代，则返回true。
判断集合中还有没有下- -个元素,有就返回true,没有就返回false
E next()返回迭代的下一个元素。
取出集合中的下一个元素
Iterator迭代器,是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
Collection接口中有-一个方法，叫iterator(),这个方法返回的就是迭代器的实现类对象
Iterator<E> iterator() 返回在此collection 的元素上进行迭代的迭代器。
迭代器的使用步骤(重点):
1.使用集合中的方法iterator( )获取迭代器的实现类对象,使用Iterator接口接收(多态)
2.使用Iterator接口中的方法hasNext判断还有没有下一-个元素
3.使用Iterator接口中的方法next取出集合中的下- -个元素
* */



/*
* 创建集合对象,使用泛型
好处:
1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
2.把运行期异常(代码运行之后会抛出的异常)提升到了编译期(写代码的时候会报错)
弊端:
泛型是什么类型,只能存储什么类型的数据
*
创建集合对象,不使用泛型
好处:
集合不使用泛型,默认的类型就是object类型,可以存储任意类型的数据
弊端:
不安全,会引发异常

* */

/*
* 泛型的通配符:
?:代表任意的数据类型
使用方式:
不能创建对象使用
只能作为方法的参数使用

* */