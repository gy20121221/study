package aost;

public class Study10 {
    public static void main(String[] args) {
        Study10T st=new Study10T();
        st.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i*i*i*1086001/220);
        }


    }
}
