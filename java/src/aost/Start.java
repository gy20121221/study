package aost;

import aost.Study.*;

import java.util.Arrays;

/**
 * @author 嘿嘿
 */
public class Start {

    public static void main(String[] args){
        num();
        out();
        out2();
        if1();
        switch1();
        for1();
        while1();
        doWhile();
        con();
        time();
        System.out.println(equal(20,30));
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        array();
        arrayA();
        arraySame();
        arrayB();
        arrayC();
        arrayD();
        arrayE();
        arrayF();
        Study stu=new Study();
        //创建：类名称 对象=new 类名称
        System.out.println(stu.name);
        //类的调用
        System.out.println(stu.age);
        //类的调用
        stu.eat();//类的调用
        stu.sleep();//类的调用
        stu.study();//类的调用
//        Scanner s=new Scanner(System.in);
//        int a;
//        a=s.nextInt();
//        System.out.println(a);
//        输入输出
        aost.Phone one=new aost.Phone();
        one.brand="小米";
        one.price=1999;
        one.color="black";
        method(one);
        //对象类型作为参数
        method(phone2());
        //对象类型作为参数
        int[] arr={5,10,25,50,100};
        System.out.println(max(arr));
        System.out.println(min(arr));
        aost.Private1 tow=new aost.Private1();
        tow.name="小飞";
        tow.setAge(20);
        tow.setMan(true);
        tow.show();
        System.out.println(tow.isMan());
        System.out.println(tow);
        aost.Student st1=new aost.Student("zzp", 4, 20);
        st1.setName("aost");
        st1.setId(1);
        st1.setAge(20);
        System.out.println("name:"+st1.getName()+" id:"+st1.getId()+" age:"+st1.getAge());

    }

    public static int min(int[] w){
        int i=0,min;
        for (min=w[i];i<w.length;i++){
            if(min>w[i]) {min=w[i];}
        }
        return min;
    }//int数组输出最小值
    public static int max(int[] w){
        int i=0,max;
        for (max=w[i];i<w.length;i++){
            if(max<w[i]) {max=w[i];}
        }
        return max;
    }//int数组输出最大值

/**    局部变量和成员变量
1.定义的位置不一样[重点]
    局部变量:在方法的内部
    成员变量:在方法的外部，直接写在类当中
2.作用范围不一样[重点]
    局部变量:只有方法当中才可以使用，出了方法就不能再用
    成员变量:整个类全都可以通用。
            3.默认值不一样[重点]
    局部变量:没有默认值，如果要想使用，必须手动进行赋值
   成员变量:如果没有赋值，会有默认值，规则和数组一样
   4.内存的位置不一样(了解)
局部变量:位于栈内存
成员变量:位于堆内存
5.生命周期不一样(了解)
局部变量:随着方法进栈而诞生，随着方法出栈而消失
成员变量:随着对象创建而诞生，随着对象被垃圾回收而消失

   **/
    public static aost.Phone phone2(){
        aost.Phone one=new aost.Phone   ();
        one.brand="小米";
        one.price=1999;
        one.color="black";
        return one;
    }
    public static void method(aost.Phone pare){
        System.out.println(pare.brand);
        System.out.println(pare.price);
        System.out.println(pare.color);
    }
    public static void arrayF(){
        int[] array1={10,20,30,40,60,80};
        System.out.print("[");
        for (int i=0;i< array1.length;i++)
        {
            if(i== array1.length-1) {
            System.out.println(array1[i]+"]");
        }else {
            System.out.print(array1[i]+",");
        }
            System.out.println("+++++++++");
            System.out.println(Arrays.toString(array1)); }

    }//面向对象和面向过程的不同。
    public static void arrayE(){
        System.out.println("@@@@@");
        int array1[]=new int[]{25,30,62,15,24};
        int i=0,j=array1.length-1;
        for (int mid;i<j;i++,j--){
            mid=array1[i];
            array1[i]=array1[j];
            array1[j]=mid;
        }
        for (int i1 = 0; i1 < array1.length; i1++) {
            System.out.println(array1[i1]);
        }
    }//首尾交换
    public static void arrayD(){
        int array1[]=new int[]{5,15,100,30,1000};
        int mid,i=1;
        for (mid=array1[0];i< array1.length;i++){
            if (mid<array1[i]) {mid=array1[i];}
        }
        System.out.println(mid);
    }//输出最大值
    public static void arrayC(){
        System.out.println("$$$$$$");
        int[] array1=new int[]{5,4,52,47,65,25,41,52,412};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }//遍历数组
    public static void arrayB(){
        int[] array1 =new int[]{1,1,5,151,5551,5515,555,222};
        int a= array1.length;
        System.out.println("@@@@@@@@");
        System.out.println(a);
        System.out.println(array1);
        //数组在程序运行期间不可以改变长度，除非重新赋值
        array1=new int[10];
        System.out.println(array1);
        System.out.println(array1.length);
    }
    public static void arraySame(){
        System.out.println("*********");
        int[] array1=new int[3];
        array1[1]=10;
        array1[2]=100;
        System.out.println(array1);
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        int[] array2=array1;
        System.out.println(array2);
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        array2[1]=20;
        array2[2]=200;
        System.out.println(array2);
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println("*******");
        System.out.println(array1);
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
    }//指针的实例
    public static void arrayA(){
        int[] array1=new int[3];
        int[] array2=new int[3];
        array1[1]=10;
        array1[2]=100;
        array2[1]=20;
        array2[2]=200;
        System.out.println(array1);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array2);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
    }//数组的调用
    public static void  array(){
        int[] array1=new int[10];
        int[] array2=new int[]{5,15,25};
        String[] array3=new String[]{"hello","world"};
        array1[1]=5;
        System.out.println(array1[1]);
        System.out.println(array2[1]);
        System.out.println(array3[1]);
    }//数组的不同定义方法，静态，动态
    public  static  int sum(int a,int b,int c) {
        return a+b+c;
    }//返回3个值相加
    public  static int sum(int a,int b){
        return a+b;
    }//返回2个值相加
    public  static boolean equal(int a, int b){
        return a==b;
    }//如果a，b相等返回ture
    public  static void time(){
        int s=0,f=0,m=0,num=0;
        for (;s<=24;s++){
            for (;f<=60;f++){
                for (;m<=60;m++)
                {num+=m;}}
            }
        System.out.println(num);
    }//for的简单使用
   public  static void con(){
        int i,s;
       for ( i=0, s=0;i<=100;i++){
           if (i==99){continue;}
           s+=i;
       }
       System.out.println(s);
    }//for和if的简单嵌套
    public  static void doWhile(){
        int i=0,s=0;
        do {
            s+=i;
            i++;
        }while (i<=100);
        System.out.println(s);
    }//do-while的简单使用
    public static void num(){
        int x=10,y;
        long z;
        float q;
        double w;
        char e;
        boolean r;
        char t;
        char m;
        int num2=1,num3=2,rlt;
        rlt=num2<num3?num2:num3;
        String qw;
        qw="hello";
        m='中';
        t='w';
        int num1=t;
        r=false;
        e='在';
        w=10.1;
        q=2.5F;
        z=100000000000000L;
        y=x*10;
        System.out.println(rlt);
        System.out.println(qw+20);
        System.out.println(m+0);
        System.out.println(num1);
        System.out.println('q');
        System.out.println(30);
        System.out.println(3.14);
        System.out.println(r);
        System.out.println(e);
        System.out.println(w);
        System.out.println(q);
        System.out.println(z);
        System.out.println(++y);
        System.out.println("hello,world!!!"+w);
        System.out.println("this is "+w+" num");
    }//各种输出方式
    public static void while1(){
        int i=0,s=0;
        while (i<=100){
            s+=i;
            i++;
        }
        System.out.println(s);
    }//while的简单使用
    public static void for1(){
        int i,s;
        for (i=0,s=0;i<=100;i++){
            s+=i;
        }
        System.out.println(s);

    }//for的简单使用
    public static void switch1(){
        int a=2;
        switch (a){
            case 1:
                System.out.println("prit1");
                break;
            case 2:
                System.out.println("prit2");
                break;
            case 3:
                System.out.println("prit3");
                break;
            default:
                System.out.println("no");
        }

    }//switch的简单使用
    public  static void if1(){
        int a=100,i=0,s=0;
        if (a>s){
            s=a/2;
            i++;
        }
        else {
            s=a*2;
            i--;
        }
        System.out.println(i);
        System.out.println(s);
        System.out.println(i+s);
    }//if-else的简单使用
    public static void out2(){
        System.out.println("hello2");
    }
    public  static void out(){
        System.out.println("hello");
    }
}
