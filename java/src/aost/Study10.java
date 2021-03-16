package aost;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//多线程  线程池  lambda表达式
public class Study10 {


    public static void main(String[] args) {

        //s10();
//        s10a();
//          s10b();
//          s10c();
//        s10d();
        s10e();

    }

    //lambda表达式应用
    private static void s10e() {
       getUsbJia(10, 20, new Study10tt() {
           @Override
           public int jia(int a, int b) {
               return a+b;
           }
       });

       //lambda表达式
       getUsbJia(100,50,
               (int a,int b)->
               { return a+b; });

        //lambda表达式 优化省略
        getUsbJia(100,50, ( a, b)-> a+b);



    }

    public static int getUsbJia(int a,int b,Study10tt study10tt){
        System.out.println(study10tt.jia(a,b));
        return study10tt.jia(a,b);
    }

    private static void s10d() {

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程s10d");
            }
        }).start();

        //使用lambda表达式,实现多线程
        new Thread(()->{
            System.out.println("lambda表达式实现多线程");
        }).start();


        //使用lambda表达式,实现多线程 优化省略lambda
        new Thread(()-> System.out.println("lambda表达式实现多线程")).start();



    }

    //线程池
    private static void s10c() {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(new Study10T());
        executorService.submit(new Study10T());
        executorService.shutdown();
    }

    private static void s10b() {
        Object o=new Object();

        new Thread(){
                @Override
                public void run() {
                    synchronized (o){
                        System.out.println("告诉老板买包子");
                        try {
                            o.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("拿到包子");
                    }
                }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o){
                    o.notify();
                    System.out.println("做包子");
                }
            }
        }.start();
    }

    private static void s10a() {
        Study10ts s1=new Study10ts();
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s1);
        Thread t3=new Thread(s1);
        t2.start();
        t1.start();
        t3.start();


    }

    private static void s10() {
           /*  Study10T st=new Study10T();
        st.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i*i*i*1086001/220);
        }*/
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("run线程");
            }
        };

        Thread t2=new Thread(runnable);
        t2.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"1");
            }
        }.start();
    }
}
/*
* 创建多线程程序的第二种方式:实现Runnabele接口
java. lang. Runnable
Runnable接口应该由那些打算通过某-线程执行其实例的类来实现。类必须定义- -个称为run 的无参数方法。
java. lang. Thread类的构造方法
Thread(Runnable target) 分配新的Thread 对象。
Thread( Runnable target, String name) 分配新的Thread 对象。
实现步骤:
1.创建一个Runnable接口的实现类
2.在实现类中重写Runnable接口的run方法，设置线程任务
3.创建- -个Runnable接口的实现类对象
4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
5.调用Thread类中的start方法,开启新的线程执行run方法
*/

/*
*
* 匿名内部类方式实现线程的创建
匿名:没有名字
内部类:写在其他类内部的类
匿名内部类作用:简化代码
把子类继承父类,重写父类的方法,创建子类对象合- -步完成
把实现类实现类接口,重写接口中的方法，创建实现类对象合成- -步完成
匿名内部类的最终产物:子类/实现类对象,而这个类没有名字
格式:
new
父类/接口(){
重复父类/接口中的方法
};
*/


/*
* 等待唤醒案例:线程之间的通信
创建一一个顾客线程(消费者):告知老板要的包子的种类和数量,调用wait方法,放弃cpu的执行，进入到WAITING状态(无限等待)
创建-一个老板线程(生产者):花了5秒做包子,做好包子之后,调用notify方法,唤醒顾客吃包子
注意:
顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一-个在执行
同步使用的锁对象必须保证唯一
只有锁对象才能调用wai t和notify方法
obejct类中的方法
void wait()
在其他线程调用此对象的notify() 方法或notifyAll() 方法前，导致当前线程等待。
void notify()
唤醒在此对象监视器上等待的单个线程。
会继续执行wait方法之后的代码

* */

/*
* 线程池:JDK1.5之后提供的
java. util. concurrent . Executors :线程池的工厂类,用来生成线程池
Executors类中的静态方法:
static ExecutorService newF ixedThreadPool(int nThreads) 创建- -个可重 用固定线程数的线程池
参数:
int nThreads :创建线程池中包含的线程数量
返回值:
ExecutorService接口,返回的是ExecutorService接口的实现类对象,我们可以使用ExecutorService接口接收(面向接口编程)
java. util. concurrent. ExecutorService :线程池接口
用来从线程池中获取线程,调用start方法,执行线程任务
submit(Runnable task) 提交- -个Runnable 任务用于执行
关闭/销毁线程池的方法
void shutdown()
线程池的使用步骤:
1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产- -个指定线程数量的线程池
2.创建一个类,实现Runnable接口，重写run方法，设置线程任务
3.调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,执行run方法
4.调用ExecutorService中的方法shutdown销毁线程池(不建议执行)
*/

/*
* Lambda表达式的标准格式:
由三部分组成:
a.-些参数
b.- -个箭头
c.-段代码
格式:
(参数列表) -> {- -些重写方法的代码};
解释说明格式:
():接口中抽象方法的参数列表,没有参数。就空着;有参数就写出参数,多个参数使用逗号分隔
-> :传递的意思，把参数传递给方法体{}
{}:重写接口的抽象方法的方法体
*/

/*
*
* Lambda表达式:是可推导,可以省略
凡是根据.上下文推导出来的内容,都可以省略书写
可以省略的内容:
1. (参数列表) ;括号中参数列表的数据类型,可以省略不写
2. (参数列表) :括号中的参数如果只有- -个，那么类型和( )都可以省略
3.{一些代码} :如果{}中的代码只有一行, 无论是否有返回值，都可以省略({},return,分号)
注意:要省略{},return,分号必须一起省略

* */