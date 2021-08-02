package aost.tread;

import java.util.ArrayList;

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
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+""+Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        T2 t2=new T2();
        ArrayList<Thread> t=new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            t.add(new Thread(t2,i+""));
        }
        for (Thread thread : t) {
            thread.start();
        }



    }


}
