package aost.demo;

import java.util.Scanner;

/**
 * description: TODO
 *
 * @author zhangpeng
 * @version 1.0
 * @date 2022/7/6 15:24
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        StringBuilder aaa= new StringBuilder("insert into data_tmp.uid_photo_request_info2(uid,filename) values");
        System.out.println("aaa");
        while (!scanner.hasNext("aaa")) {
            String s = scanner.nextLine();
            s="("+s+"),";
            aaa.append(s);
        }

        System.out.println(aaa);
    }
}
