package aost;

public class Keyb implements Usb {
    @Override
    public int jia(int a, int b) {
        return a + b;
    }

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("使用键盘");
    }
}
