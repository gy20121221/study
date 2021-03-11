package aost;


//多线程
public class Study10 {
    public static void main(String[] args) {

        //s10();
        s10a();

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