package aost;

public class Study10T extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("T"+"线程1");
        }
    }
}
