package aost;

public class MyThread1 implements Runnable{
    private  int i=0;
    @Override
    public  void  run() {

        for (int j = 0; j < 100; j++) {
            i++;
            System.out.println(i);
            System.out.println(this.toString());
        }



    }

    public static void main(String[] args) {
        Thread thread=new Thread(new MyThread1());
        thread.start();
        Thread thread1=new Thread(new MyThread1());
        thread1.start();
        Thread thread2=new Thread(new MyThread1());
        thread2.start();
    }
}
