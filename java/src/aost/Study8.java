package aost;

import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

//可变差数,Map,汉字排序,compare重载
public class Study8 {
    public static void main(String[] args) {

        System.out.println(add(10,20,10,30,50,55,55,84,88));

        s8a();
        s8b();
        s8c();
        s8d();
        s8e();


    }

    private static void s8e() {
        Map<Study8Date2,String> map1=new HashMap<>();
        map1.put(new Study8Date2(22,"lbw"),"sb");
        map1.put(new Study8Date2(23,"qwq"),"sb");
        map1.put(new Study8Date2(22,"lbw"),"sb");
        map1.put(new Study8Date2(25,"lw"),"sb");

        for (Study8Date2 s :
                map1.keySet()) {
            System.out.println(s+"id:"+s.getId()+"name:"+s.getName());
        }
    }


    //map 遍历
    private static void s8d() {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("lbw",21);
        map1.put("lxy",21);
        map1.put("pyy",24);
        map1.put("zsf",23);
        System.out.println(map1);

        //第一种方法
        for (String key :
                map1.keySet()) {
            System.out.println(map1.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for (Map.Entry<String, Integer> e:
               entries ) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


    }

    //map 4个方法
    private static void s8c() {
        Map<String,Integer> map=new HashMap<>();
        map.put("lbw",21);
        map.put("lxy",21);
        map.put("pyy",24);
        map.put("zsf",23);
        System.out.println(map);

        map.remove("lbw");
        System.out.println(map);

        boolean lbw = map.containsKey("lbw");
        System.out.println(lbw);

        Integer lbw1 = map.get("lbw");
        System.out.println(lbw1);

    }

    //实现了汉字排序
    private static void s8b() {
        ArrayList<Study8Date1> arrayList=new ArrayList<>();
        arrayList.add(new Study8Date1("张",12));
        arrayList.add(new Study8Date1("蒋勤",13));
        arrayList.add(new Study8Date1("李白",22));
        arrayList.add(new Study8Date1("张鹏",42));
        arrayList.add(new Study8Date1("李",12));

        arrayList.sort(new Comparator<Study8Date1>() {
            @Override
            public int compare(Study8Date1 o1, Study8Date1 o2) {
                int i = o1.getAge() - o2.getAge();
                if (i == 0) {
                    Collator collator = Collator.getInstance(Locale.CHINA);
                    CollationKey collationKey1=collator.getCollationKey(o1.getName());
                    CollationKey collationKey2=collator.getCollationKey(o2.getName());
                    i=collationKey1.compareTo(collationKey2);
                }
                return i;
            }
        });
        System.out.println(arrayList);
    }

    private static void s8a() {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(11);
        arrayList.add(11);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        ArrayList<Study8Date> arrayList1=new ArrayList<>();
        arrayList1.add(new Study8Date("qwq",12));
        arrayList1.add(new Study8Date("q",23));
        arrayList1.add(new Study8Date("wq",22));
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
    }

    //可变差数,
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


/*
* java. utils. Collections是集合工具类，用来对集合进行操作。部分方法如下:
public static <T> void sort(List<T> list) :将集合中元素按照默认规则排序。
注意:
sort(List<T> list )使用前提
被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则
Comparable接口的排序规则:
自己(this)-参数:升序

* */
/*
* ●java.utils .Collections是集合工具类,用来对集合进行操作。部分方法如下:
public static <T> boolean addAll(Collection<T> C, T... elements) :往集合中添加一-些元素。
●public static void shuffle(List<?> list)打乱顺序:打乱集合顺序。
●public static <T> void sort(List<T> list) :将集合中元素按照默认规则排序。
●| public static <T> void sort(List<T> list，Comparator<? super T> ) | :将集合中元素按照指定规则排
序。
*/

/*Collection中的集合,元素是孤立存在的(理解为单身) , 向集合中存储元素采用一个个元素的方式存储。
Map中的集合,元素是成对存在的(理解为夫妻)。每个元素由键与值两部分组成,通过键可以找对所对应的
值。
|collection中的集合称为单列集合，Map中的集合称为双列集合。
需要注意的是，Map 中的集合不能包含重复的键,值可以重复;每个键只能对应一个值。
*/


/*
* java.util .Map<k,v>集合
Map集合的特点:
1.Map集合是-一个双列集合,一 个元素包含两个值(- -个key, -个value)
2.Map集合中的元素, key和value的数据类型可以相同,也可以不同
3.Map集合中的元素, key是不允许重复的，value是可以重复的
4.Map集合中的元素, key和value是一--对应
java . util.HashMap<k, v>集合implements Map<k, v>接口
HashMap集合的特点:
1.HashMap集合底层是哈希表:查询的速度特别的快
JDK1.8之前:数组+单向链表
JDK1.8之后:数组+单向链表/红黑树(链表的长度超过8) :提高查询的速度
2. hashMap集合是- -个无序的集合,存储元素和取出元素的顺序有可能不一-致
java. util. L inkedHashMap<k, v>集合extends HashMap<k, v>集合
L inkedHashMap的特点:
1.L inkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
2. L inkedHashMap集合是-个有序的集合 ,存储元素和取出元素的顺序是-致的

* */

/*
* public V put(K key, v value)]:把指定的键与指定的值添加到Map集合中。
public v remove(Object key) :把指定的键所对应的键值对元素在Map集合中删除,返回被删除元素的值。
public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
boolean containsKey(Object key) 判断集合中是否包含指定的键。
public Set<K> keySet() :获取Map集合中所有的键,存储到Set集合中。
public Set<Map. Entry<K,V>> entrySet() :获取到Map集合中所有的键值对对象的集合(Set集合)。

* */

/*
* 
* Map集合遍历的第二种方式:使用Entry对象遍历
Map集合中的方法:
Set<Map. Entry<K, V>> entrySet() 返回此映射中包含的映射关系的Set视图。
实现步骤:
1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到- -个Set集合中
2.遍历Set集合,获取每一-个Entry对象
3.使用Entry对象中的方法getKey( )和getValue( )获取键与值
*/
/*
* HashMap存储自定义类型键值I
Map集合保证key是唯一-的:
作为key的元素,必须重写hashCode方法和equal s方法,以保证key唯一
* */