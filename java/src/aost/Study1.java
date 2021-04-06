package aost;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 嘿嘿
 */
public class Study1 {
    public static void main(String[] args) {


        /* 引用类型的一般使用步骤:
         1.导包
         import包路径.类名称; .
         如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
         只有java. lang包下的内容不需要导包，其他的包都需要import语句。
         2.创建
         类名称对象名= new, 类名称();
         3.使用
         对象名.成员方法名()
         *//*
         *//*Scanner a=new Scanner(System.in);
         int b;
         b=a.nextInt();
         System.out.println(b);*//*
         Scanner s=new Scanner(System.in);
         int a;
         a=s.nextInt();
         System.out.println(a);
         String b=s.next();
         System.out.println(b);*/

        /* Scanner s=new Scanner(System.in);
         int a=s.nextInt(),b=s.nextInt();
         System.out.println(a+b);//键盘输入，相加*/


         /*//输入值，输出最大值。
         Scanner s=new Scanner(System.in);
         int[] a=new int[100];
         int q=0,i=0,j=0;
         System.out.println("请输入要比较的数，输入0时结束输入。");
         for (;j<100;j++,i++){
             a[i]=q;
             a[i+1]=s.nextInt();
             q=Math.max(a[i],a[i+1]);
             if (a[i+1]==0) break;
         }
         System.out.println("最大值:"+q);*/


        /* Person one= new Person();
         one.name="aost";
         one.show();
         new Person().name="qwq";
         new Person().show();
                 //注意事项:匿名对象只能使用唯一-的一次，下次再用不得不再创建一-个新对象。
         //使用建议:如果确定有一个对象只需要使用唯一-的一次，就可以用匿名对象。*/


         /*Scanner s=personShow();
         int a=s.nextInt();
         System.out.println(a);
         String b=s.next();
         System.out.println(b);
         //匿名对象的函数调用
         */


         /*Random r=new Random();
         System.out.println(r.nextInt());
         //随机数 使用
         for (int i=0;i<20;i++){
             System.out.println(r.nextInt(56)+1);//随机数，56为范围0-55；+1后整体范围变成1-56；
         }*/


         /*Random r=new Random();
         Scanner s=new Scanner(System.in);
         int a=r.nextInt(20);
         while (true){
             System.out.println("输入你猜的数");
             int b=s.nextInt();
             if (a<b){
                 System.out.println("大了");
             }
             else if (a>b){
                 System.out.println("小了");
             }
             else if (a==b){
                 System.out.println("对了");
                 break;
             }
         }
         System.out.println(a);//猜数字 */


          /*Person[] ar=new Person[3];
          Person one=new Person("szr",20);
          Person two=new Person("ll",20);
          Person three=new Person("zzp",20);
          ar[0]=one;
          ar[1]=two;
          ar[2]=three;
          System.out.println(ar[0]);
          System.out.println(ar[1]);
          System.out.println(ar[2]);//输出的是地址值
          ar[1].show();
          System.out.println(ar[1].getName());
          //函数作为数组对象
          //数组有一个缺点:一旦创建，程序运行期间长度不可以发生改变。*/


    }



     /*public static Scanner  personShow(){
         return new Scanner(System.in);
     }//匿名对象做返回值*/

}
