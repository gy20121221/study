package aost;

public class MyThread extends Thread{
    public  void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        Thread t1=new Thread(new MyThread());
//        t1.start();

        MyThread[] mts = new MyThread[10];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new MyThread();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }




    }


    @Override
    public void run() {
        System.out.println(MySingleton.getInstance().hashCode());
    }

    public static class MySingleton {
        //使用volatile关键字保其可见性
        static volatile private  MySingleton instance = null;

        private MySingleton(){}

        public static MySingleton getInstance() {
            try {
                if(instance != null){//懒汉式

                }else{
                    //创建实例之前可能会有一些准备性的耗时工作
                    Thread.sleep(300);
                    synchronized (aost.MySingleton.class) {
                        if(instance == null){//二次检查
                            instance = new MySingleton();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return instance;
        }

    }
}
