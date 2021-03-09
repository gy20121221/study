package arith;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Art1 {
    private static final Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {
        //a1();
//        a2();
//        a3();
          a4();
    }



    private static void a4() {
    }


    //手动输入一个任意位数，求各位数字之和
    private static void a3() {
        int i = scanner.nextInt();
        int s = 0;
        int n=0,x=1;
        for (int j = 9; x>0 ; j=j*10+j,n++) {
            x=i-j;
        }
        System.out.println(n);
        for (int j = 0; j < n; n--) {
            int t=(int)Math.pow(10,n-1);
            s+=i/t%10;
        }
        System.out.println(s);

    }

    //1.2商场举行店庆，抽几折打几折，
    //先手动输入消费金额，再输入，抽到的折扣，计算出折后价格
    private static void a2() {
        double v1 = scanner.nextDouble();
        int v = (int) (Math.random()*10);
        System.out.println(v1*v/10);
    }

    //1变量、运算符和类型转换：
    //1.1手动输入一个学生的成绩，对这个成绩进行一次加分，加当前成绩的20%，输出加分后成绩
    private static void a1() {
        double cj = scanner.nextDouble();
        cj=cj+cj*0.2;
        System.out.println(cj);
    }


}
