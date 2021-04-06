package aost;

import java.util.ArrayList;
import java.util.Random;

public class Exer2 {
    public static void main(String[] args) {
        ArrayList<aost.Student> lis = new ArrayList<>();
        aost.Student a = new aost.Student("zzp", 4, 20);
        aost.Student b = new aost.Student("szr", 3, 20);
        aost.Student c = new aost.Student("dhf", 2, 20);
        aost.Student d = new aost.Student("ll", 1, 20);
        lis.add(a);
        lis.add(b);
        lis.add(c);
        lis.add(d);
        for (int i = 0; i < lis.size(); i++) {
            aost.Student stu = lis.get(i);
            System.out.println("姓名" + stu.getName() + "学号" + stu.getId() + "年龄" + stu.getAge());
        }//输出

        //ArrayList做方法参数
        ArrayList<String> list = new ArrayList<>();
        list.add("szr");
        list.add("zzp");
        list.add("dhf");
        lay(list);

        System.out.println();
        System.out.println("===========");
        //分割线


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random r = new Random();
        int q = 20;
        for (int i = 0; i < q; i++) {
            list1.add(r.nextInt(101));
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list2.add(list1.get(i));
            }
        }
        System.out.println(list2);
        /*
         * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
         * 要求使用自定义的方法来实现筛选。*/
    }

    public static void lay(ArrayList<String> list) {
        System.out.print("(");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i == list.size() - 1) {
                System.out.print(")");
            } else {
                System.out.print("@");
            }
        }
    }//ArrayList做方法参数
}
/*
* 自定义4个学生对象，添加到集合，并遍历。
* 田久
芯岭:
1.自定义Student学生类， 四个部分
。
2.创建一个集合，用来存储学生对象。泛型: <Student>
3.根据类，创建4个学生对象。
4.将4个学生对象添加到集合中: add
5.遍历集合: for、size、get

 * */

/*
* 定义方法的三要素
返回值类型:只是进行打印而已，没有运算，没有结果;所以用void
方法名称: printArraylist
参数列表: Arraylist
*/

/*
* 分析:
1.需要创建一个大集合，用来存储int数字: <Integer>
2.随机数字就用Random nextInt
3.循环20次，把随机数字放入大集合: for循环、add方法
4.定义一个方法，用来进行筛选。
筛选:根据大集合，筛选符合要求的元素，得到小集合。
三要素
返回值类型: ArrayList小集合(里面元素个数不确定)
方法名称: getSmalllist
参数列表: ArrayList大集合(装着20个随机数字)
50判断(if)是偶数:num%2==θ
*/
