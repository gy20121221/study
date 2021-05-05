package aost;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author aost
 * @Description
 * @Date  2021/5/3
 * @Param 
 * @Return 
 * @MethodName 
 */
public class Exer1 {
    public static void main(String[] args) {
       
        Random r = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list1.add(r.nextInt(32) + 1);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(list1.get(i));
        }

    }
}
/*
* 生成6个1~33之间的随机整数，添加到集合，并遍历集合。
用路。
心止
合:
1.需要存储6个数字，创建一 个集合，<Integer>
2.产生随机数，需要用到Random
3.用循环6次，来产生6个随机数字: for循环
4. 循环内调用r. nextInt(int n),参数是33，0~32， 整体+1才是1~33
5.把数字添加到集合中: add
6. 遍历集合: for、 size、get
*/
