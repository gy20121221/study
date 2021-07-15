package aost.java8;

import java.util.Arrays;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/7/14 18:49
 */
public class A1 {

    public static void main(String[] args) {
        lombok();

    }

    private static void lombok() {

        String[] stars= {"1", "2", "121", "32", "2", "3", "5", "2"};
        Arrays.sort(stars, (x, y) -> (x + y).compareTo(y + x));
        for (String star : stars) {
            System.out.println(star);
        }
    }


}
