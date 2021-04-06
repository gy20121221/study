package aost;

public class Study10ts implements Runnable {
    private int p = 100;

    Object object = new Object();


    @Override
    public void run() {

        synchronized (object) {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (p > 0) {
                    System.out.println(Thread.currentThread().getName() + "$$" + p);
                    p--;
                }
            }
        }


    }
}
