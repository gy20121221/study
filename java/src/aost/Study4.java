package aost;

import java.util.Arrays;

/**
 * @author 嘿嘿
 */
public class Study4 {
    public static void main(String[] args) {

        //数组使用
/*            String str="qwsfjgajkfghaskeqe";
            char[] arrchar=str.toCharArray();
            Arrays.sort(arrchar);
        for (char a :
                arrchar) {
            System.out.print(a);
        }
        System.out.println();
        for (int i= arrchar.length-1; i>=0; i--) {
            System.out.print(arrchar[i]);
        }*/

      /*  Tphone tphone=new Tphone();
        tphone.name="qwq";
        tphone.setAge(18);
        tphone.setMan(true);
        tphone.show();
        System.out.println(tphone.getPrime(28));*/



/*        Phone mi=new Mi();
        mi.setBrand("mi");
        mi.setColor("red");
        mi.setPrice(1599);
        System.out.println(mi.toString());*/


        Computer computer=new Computer();
        computer.openC();

        computer.userUsb(new Mouse());

        computer.close();

    }


}
