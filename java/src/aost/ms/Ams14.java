package aost.ms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/8/2 19:44
 */
public class Ams14 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> move = new ArrayList<>();
        move.add("A");
        move.add("D");
        move.add("W");
        move.add("S");

        int x = 0, y = 0;
        while (sc.hasNext()) {
            String[] split = sc.nextLine().split(";");

            for (String s : split) {
                if (s.length()<2) break;
                String moveType = s.substring(0, 1);
                String moveStep = s.substring(1 );
                if (move.contains(moveType)) {
                    try {
                        int i = Integer.parseInt(moveStep);
                        switch (moveType) {
                            case "A":
                                x -= i;
                                break;
                            case "D":
                                x+=i;
                                break;
                            case "W":
                                y+=i;
                                break;
                            case "S":
                                y-=i;
                                break;
                            default:
                                break;
                        }
                    } catch (Exception e) {
                        continue;
                    }
                }
            }
            System.out.println(x+","+y);
        }
    }


    public static void split(String line) {
        while (line.length() >= 8) {
            System.out.println(line.substring(0, 8));
            line = line.substring(8);
        }
        if (line.length() > 0) {
            line += "00000000";
            System.out.println(line.substring(0, 8));
        }
    }


    public void test2() {
        Scanner sc = new Scanner(System.in);
        //获取个数
        int num = sc.nextInt();
        //创建TreeSet进行去重排序
        TreeSet<Integer> set = new TreeSet<>();
        //输入
        for (int i = 0; i < num; i++) {
            set.add(sc.nextInt());
        }

        set.forEach(System.out::println);
    }

    public void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String line = br.readLine();
        String lowerCase = line.toLowerCase();
        String s1 = s.toLowerCase();

        System.out.println(s1.length() - s1.replaceAll(lowerCase, "").length());
    }

    public void test() {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            String[] s = next.split(" ");
            System.out.println(s[s.length - 1].length());
        }
    }

    public void main() throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        String str;
        st.nextToken();
        int k = (int) st.nval;
        st.nextToken();
        long n = (long) st.nval;
        n--;

        LinkedList<Long> stack = new LinkedList<>();
        while (n > 0) {
            stack.addLast(n % 9);
            n /= 9;
        }

        long ans = 0;
        while (!stack.isEmpty()) {
            ans *= 10;
            if (stack.peekFirst() >= k) {
                ans += stack.pollFirst() + 1;
            } else {
                ans += stack.pollFirst();
            }
        }

        System.out.println(ans);
    }
}
