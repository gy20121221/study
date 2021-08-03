package aost.ms;

import java.util.Scanner;

/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/8/2 19:04
 */
public class Ams13 {
    public static int m,n;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            m=x;
            n=y;
            int[][] ints=new int[x][y];
            boolean[][] ex=new boolean[x][y];
            int[] s={0};
            for (int i=0; i < x; i++) {
                for (int j=0; j < y; j++) {
                    ints[i][j]=scanner.nextInt();
                }
            }
            boolean dfs = dfs(0, 0, ex, s, ints);
            System.out.println();
            if (dfs) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
            t--;
        }
    }
    public static boolean dfs(int x, int y,  boolean[][] ex, int[] s,int[][] ints) {
        if (x < 0 || y < 0 || x >= ex.length || y >= ex[0].length || ex[x][y] || ints[x][y]<s[0]) {
            return false;
        }
        if (m-1==x&&n-1==y) {
            return true;
        }
        ex[x][y] = true;
        s[0]++;
        return (dfs(x + 1, y, ex, s,ints) || dfs(x - 1, y, ex, s,ints) || dfs(x, y + 1, ex, s,ints) || dfs(x, y - 1,  ex, s,ints));
    }


}
