package aost;

import Study.Study;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author �ٺ�
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
        //������������ ����=new ������
        System.out.println(stu.name);
        //��ĵ���
        System.out.println(stu.age);
        //��ĵ���
        stu.eat();//��ĵ���
        stu.sleep();//��ĵ���
        stu.study();//��ĵ���
//        Scanner s=new Scanner(System.in);
//        int a;
//        a=s.nextInt();
//        System.out.println(a);
//        �������
        aost.Phone one=new aost.Phone();
        one.brand="С��";
        one.price=1999;
        one.color="black";
        method(one);
        //����������Ϊ����
        method(phone2());
        //����������Ϊ����
        int[] arr={5,10,25,50,100};
        System.out.println(max(arr));
        System.out.println(min(arr));
        aost.Private1 tow=new aost.Private1();
        tow.name="С��";
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
    }//int���������Сֵ
    public static int max(int[] w){
        int i=0,max;
        for (max=w[i];i<w.length;i++){
            if(max<w[i]) {max=w[i];}
        }
        return max;
    }//int����������ֵ

/**    �ֲ������ͳ�Ա����
1.�����λ�ò�һ��[�ص�]
    �ֲ�����:�ڷ������ڲ�
    ��Ա����:�ڷ������ⲿ��ֱ��д���൱��
2.���÷�Χ��һ��[�ص�]
    �ֲ�����:ֻ�з������вſ���ʹ�ã����˷����Ͳ�������
    ��Ա����:������ȫ������ͨ�á�
            3.Ĭ��ֵ��һ��[�ص�]
    �ֲ�����:û��Ĭ��ֵ�����Ҫ��ʹ�ã������ֶ����и�ֵ
   ��Ա����:���û�и�ֵ������Ĭ��ֵ�����������һ��
   4.�ڴ��λ�ò�һ��(�˽�)
�ֲ�����:λ��ջ�ڴ�
��Ա����:λ�ڶ��ڴ�
5.�������ڲ�һ��(�˽�)
�ֲ�����:���ŷ�����ջ�����������ŷ�����ջ����ʧ
��Ա����:���Ŷ��󴴽������������Ŷ����������ն���ʧ

   **/
    public static aost.Phone phone2(){
        aost.Phone one=new aost.Phone   ();
        one.brand="С��";
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

    }//��������������̵Ĳ�ͬ��
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
    }//��β����
    public static void arrayD(){
        int array1[]=new int[]{5,15,100,30,1000};
        int mid,i=1;
        for (mid=array1[0];i< array1.length;i++){
            if (mid<array1[i]) {mid=array1[i];}
        }
        System.out.println(mid);
    }//������ֵ
    public static void arrayC(){
        System.out.println("$$$$$$");
        int[] array1=new int[]{5,4,52,47,65,25,41,52,412};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }//��������
    public static void arrayB(){
        int[] array1 =new int[]{1,1,5,151,5551,5515,555,222};
        int a= array1.length;
        System.out.println("@@@@@@@@");
        System.out.println(a);
        System.out.println(array1);
        //�����ڳ��������ڼ䲻���Ըı䳤�ȣ��������¸�ֵ
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
    }//ָ���ʵ��
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
    }//����ĵ���
    public static void  array(){
        int[] array1=new int[10];
        int[] array2=new int[]{5,15,25};
        String[] array3=new String[]{"hello","world"};
        array1[1]=5;
        System.out.println(array1[1]);
        System.out.println(array2[1]);
        System.out.println(array3[1]);
    }//����Ĳ�ͬ���巽������̬����̬
    public  static  int sum(int a,int b,int c) {
        return a+b+c;
    }//����3��ֵ���
    public  static int sum(int a,int b){
        return a+b;
    }//����2��ֵ���
    public  static boolean equal(int a, int b){
        return a==b;
    }//���a��b��ȷ���ture
    public  static void time(){
        int s=0,f=0,m=0,num=0;
        for (;s<=24;s++){
            for (;f<=60;f++){
                for (;m<=60;m++)
                {num+=m;}}
            }
        System.out.println(num);
    }//for�ļ�ʹ��
   public  static void con(){
        int i,s;
       for ( i=0, s=0;i<=100;i++){
           if (i==99){continue;}
           s+=i;
       }
       System.out.println(s);
    }//for��if�ļ�Ƕ��
    public  static void doWhile(){
        int i=0,s=0;
        do {
            s+=i;
            i++;
        }while (i<=100);
        System.out.println(s);
    }//do-while�ļ�ʹ��
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
        m='��';
        t='w';
        int num1=t;
        r=false;
        e='��';
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
    }//���������ʽ
    public static void while1(){
        int i=0,s=0;
        while (i<=100){
            s+=i;
            i++;
        }
        System.out.println(s);
    }//while�ļ�ʹ��
    public static void for1(){
        int i,s;
        for (i=0,s=0;i<=100;i++){
            s+=i;
        }
        System.out.println(s);

    }//for�ļ�ʹ��
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

    }//switch�ļ�ʹ��
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
    }//if-else�ļ�ʹ��
    public static void out2(){
        System.out.println("hello2");
    }
    public  static void out(){
        System.out.println("hello");
    }
}
