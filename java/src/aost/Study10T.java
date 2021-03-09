package aost;

public class Study10T extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("T"+i*i*i*1086001/10/221);
        }
    }
}
