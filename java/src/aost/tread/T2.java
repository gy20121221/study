package aost.tread;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/7/26 15:41
 */
public class T2 implements Runnable{
    public T2(){

    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+""+Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        T2 t2=new T2();
        Thread m1=new Thread(t2,"A");
        Thread m2=new Thread(t2,"B");
        Thread m3=new Thread(t2,"C");
        m1.start();
        m2.start();
        m3.start();
    }


}
