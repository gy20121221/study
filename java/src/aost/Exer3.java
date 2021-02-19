package aost;
//《算法》中的代码
import java.util.Random;
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        /*int a,b=0;
        int c=a=5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        /*double[] a=new double[11];
        int n=a.length;
        for (int i = 0; i < n; i++) {
            a[i]=i;
            System.out.print(a[i]+",");
        }
        System.out.println();
        for (int i = 0; i < n/2; i++) {
            double temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+",");
        }// 颠倒数组对象*/

        /*Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("是质数："+getPrime(a));*/

        /*double b=s.nextInt();
        System.out.println(Math.sqrt(b));//计算平方根*/


        /*System.out.println(hypo(3,4));//计算三角形斜边*/

        /*int a= (int) (Math.random() * (10 - 1)) +1;//规定范围在[1-10)之间
        System.out.println(a);//随机数*/


       /*System.out.println( recursive(10,-1));*/

        System.out.println(getPrime(8));
    }

    public static int recursive(int a,int i){
        i++;
        if (a==1) {return i;}
        return recursive(a/2,i);
    }//递归思想，一个数多少次被除到1

    public static double  hypo(double a,double b){
        return Math.sqrt(a*a+b*b);
    }//计算三角形斜边

    public static boolean getPrime(int a){
        if (a<2) { return false; }
        for (int i = 2; i*i<= a; i++)
        {
            if (a%i==0){return false;} }
            return true;
    }//最简单判断质数的办法。

}
