package aost;

public class Computer {
    public void openC(){
        System.out.println("打开电脑");
    }
    public void close(){
        System.out.println("关闭电脑");
    }

    public void userUsb(Usb usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.clk();
        }else if(usb  instanceof Keyb){
            Keyb keyb=(Keyb) usb;
            keyb.type();
        }


        usb.close();
    }

}
