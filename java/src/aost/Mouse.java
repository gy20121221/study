package aost;

public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    @Override
    public int jia(int a, int b) {
        return a+b;
    }

    public void clk(){
        System.out.println("点击鼠标");
    }
}
