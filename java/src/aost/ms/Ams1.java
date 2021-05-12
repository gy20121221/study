package aost.ms;

import java.util.Scanner;

public class Ams1 {
    //    输入数据包括一行： 两个正整数N(1 ≤ N ≤ 1000000000),L(2 ≤ L ≤ 100)
//    从小到大输出这段连续非负整数，以空格分隔，行末无空格。如果没有这样的序列或者找出的序列长度大于100，则输出No
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int ll = 101, J = 0, I = 0;
        for (int i = 1; i <= N / 2; i++) {
            int s = i;
            for (int j = i + 1; (j <= i + 100); j++) {
                s += j;
                if (s == N && ((j - i) >= L)) {
                    if (ll > j - i) {
                        ll = j - i;
                        J = j;
                        I = i;
                    }
                }
            }
        }

        if (I == 0 && J == 0) System.out.println("NO");
        else {
            while (I <= J) {
                if (I == J) {
                    System.out.println(I);
                } else System.out.print(I + " ");
                I++;
            }
        }

    }
}
