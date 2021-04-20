package aost;



public class MyThread extends Thread {

    private static int i=0;

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        System.out.println(i);
    }

    @Override
    public  void run() {
        ++i;
        System.out.println("Ïß³Ì"+i);
    }

}

