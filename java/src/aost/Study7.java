package aost;

//数据结构
public class Study7 {
    public static void main(String[] args) {
        s7a();
    }

    private static void s7a() {

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
