package aost.tread;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/7/26 15:25
 */
public class T1 extends Thread{

    public T1(){

    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+""+T1.currentThread());
        }
    }




    public static void main(String[] args) {
        T1 t1=new T1();
        T1 t2=new T1();
        T1 t3=new T1();
        t1.start();
        t2.start();
        t3.start();
    }
}
