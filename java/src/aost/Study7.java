package aost;

import java.util.HashSet;
import java.util.LinkedList;

//数据结构
public class Study7 {
    public static void main(String[] args) {
        s7a();
        s7b();
        s7c();
    }

    private static void s7c() {
        HashSet<Study7Test> study7TestHashSet=new HashSet<>();
        Study7Test s1=new Study7Test("lbw",1);
        Study7Test s2=new Study7Test("lbw",1);
        Study7Test s3=new Study7Test("lbw",2);
        Study7Test s4=new Study7Test("qwq",1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        study7TestHashSet.add(s1);
        study7TestHashSet.add(s2);
        study7TestHashSet.add(s3);
        study7TestHashSet.add(s4);
        System.out.println(study7TestHashSet);
    }

    private static void s7b() {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(6);
        hashSet.add(62);
        hashSet.add(2);
        for (int i :
                hashSet) {
            System.out.println(i);
        }
    }

    public static void s7a() {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("a");
        linkedList.add("c");
        System.out.println(linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.getFirst());
        linkedList.push("qwq");
    }

}
/*
* java. util.List接口extends Collection接口
List接口的特点:
1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
2.有索引,包含了-些带索引的方法
3.允许存储重复的元素
List接口中带索引的方法(特有)
public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。
public E get(int index) :返回集合中指定位置的元素。
. public E remove(int index): 移除列表中指定位置的元素，返回的是被移除的元素。
- public E set(int index, E element) :用指定元素替换集合中指定位置的元素，返回值的更新前的元素。
注意:
操作索引的时候, - -定要防止索引越界异常

* */


/*
* | java.util.Arraylist集合数据存储的结构是数组结构。元素增删慢,查找快,由于日常开发中使用最多的功能
为查询数据、遍历数据,所以ArrayList是最常用的集合。
许多程序员开发时非常随意地使用ArrayList完成任何需求,并不严谨,这种用法是不提倡的。

* */


/*
* LinkedList集合的特点:
1.底层是一个链表结构:查询慢,增删快
2.里边包含了大量操作首尾元素的方法
注意:使用L inkedList集合特有的方法,不能使用多态
- public void addFirst(E e):将指定元素插入此列表的开头。
- public void addLast(E e):将指定元素添加到此列表的结尾。
- public void push(E e):将元素推入此列表所表示的堆栈。
- public E getFirst():返回此列表的第一 -个元素。
- public E getlast():返回此列表的最后- -个元素。
- public E removeFirst():移除并返回此列表的第-个元素。
- public E removelast():移除并返回此列表的最后-个元素。
- public E pop():从此列表所表示的堆栈处弹出一-个元素。
- public boolean isEmpty():如果列表不包含元素,则返回true。

* */


/*
* java. util.Set接口extends Collect ion接口
Set接口的特点:
1.不允许存储重复的元素
2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
java. util.HashSet集合implements Set接口
HashSet特点:
1.不允许存储重复的元素
2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
3.是一个无序的集合,存储元素和取出元素的顺序有可能不- -致
4.底层是一个哈希表结构(查询的速度非常的快)

* */


/*
* Set集合在调用add方法的时候add方法会调用元素的hashCode方法和equals方法,判断元素是否重复

2.3 HashSet存储自定义类型元素
给HashSet中存放自定义类型元素时,需要重写对象中的hashCode和equals方法,建立自己的比较方式,才能保
证HashSet集合中的对象唯一

 * */
/*
*
* java. util.linkedHashSet集合extends HashSet集合
LinkedHashSet集合特点:
底层是一个哈希表(数组+链表/红黑树)+链表:多了-条链表(记录元素的存储顺序),保证元素有序

* */