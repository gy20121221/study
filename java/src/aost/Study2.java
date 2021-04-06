package aost;

import java.util.ArrayList;

/**
 * @author 嘿嘿
 */
public class Study2 {
    public static void main(String[] args) {

        /*ArrayList<String> list=new ArrayList<>();
        list.add("zzp");//添加
        list.add("szr");
        list.add("ll");
        System.out.println(list);*/

        ArrayList<String> list = new ArrayList<>();
        list.add("szr");
        list.add("ll");
        list.add("czl");
        boolean a = list.add("zzp");
        System.out.println(a);
        //list.add有返回值，为true
        String b = list.get(2);
        //索引，参数为元素位置
        System.out.println(b);
        String c = list.remove(0);
        //有返回值，为被删除的元素
        System.out.println(c);
        System.out.println(list);
        System.out.println(list.size());
        //获取长度
        for (int i = 0; i < list.size(); i++) {
            System.out.println("元素:" + list.get(i));
            //遍历
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(21);
        list1.add(33);
        System.out.println(list1.get(0));

    }
}
/*
数组的长度不可以发生改变。
        但是Arraylist集合的长度是可以随意变化的。
        对于ArrayList来说，有一个尖括号<E>代表泛型.
        泛型:也就是装在集合当中的所有元素，全都是统- -的什么类型。
        注意:泛型只能是引用类型，不能是基本类型。
*/

/*
public boolean add(E e): 向集合当中添加元素，参数的类型和泛型-致。
public E get(int index): 从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index): 从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public int size(): 获取集合的尺寸长度，返回值是集合中包含的元素个数。
*/

/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类'
byte     Byte
short    Short
int      Integer【特殊】
long     Long
float    Float
double   Double
char     Character【特殊】
boolean  Boolean
 */
