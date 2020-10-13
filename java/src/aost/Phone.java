package aost;

public class Phone {

    String brand;
    double price;
    String color;
    //成员变量
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void send(){
        System.out.println("群发短信");
    }

}
