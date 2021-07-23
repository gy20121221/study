package aost.leetCode;


import java.util.ArrayList;


/**
 * @author aost
 * @version 1.0
 * @description:
 * @date 2021/7/21 9:01
 */
public class A5 {

    public static void main(String[] args) {

    }


    /**
     * description  请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     *
     * @author aost
     * time 0 100%  arm  43%
     * date 9:02 2021/7/21
     * param [s]
     * return java.lang.String
     */

    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }


    /**
     * description  地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
     * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
     * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
     * 请问该机器人能够到达多少个格子？
     *
     * @author aost
     * time 1 80%  arm  70%   深度优先遍历  movingCount
     * time 0 100%  arm  70%   深度优先遍历（官方）movingCountTop
     * date 9:56 2021/7/21
     * param [m, n, k]
     * return int
     */
    public int movingCount(int m, int n, int k) {
        int[] s = {0};
        int x = 0, y = 0;
        boolean[][] ex = new boolean[m][n];
        if (k == 0) {
            return ++s[0];
        }
        dfs(x, y, k, ex, s);
        return s[0];
    }

    public boolean dfs(int x, int y, int k, boolean[][] ex, int[] s) {
        if (x < 0 || y < 0 || x >= ex.length || y >= ex[0].length || ex[x][y] || isOut(x, y, k)) {
            return false;
        }
        ex[x][y] = true;
        s[0]++;

        return (dfs(x + 1, y, k, ex, s) || dfs(x - 1, y, k, ex, s) || dfs(x, y + 1, k, ex, s) || dfs(x, y - 1, k, ex, s));
    }

    public boolean isOut(int m, int n, int k) {
        int m1 = 1, n1 = 1, q = m, w = n, ten = 10;
        while (q >= ten) {
            q = q / 10;
            m1++;
        }
        while (w >= ten) {
            w = w / 10;
            n1++;
        }
        while (m1 > 0) {
            int i1 = m % 10;
            m = m / 10;
            k -= i1;
            if (k < 0) {
                return true;
            }
            m1--;
        }
        while (n1 > 0) {
            int i1 = n % 10;
            n = n / 10;
            k -= i1;
            if (k < 0) {
                return true;
            }
            n1--;
        }
        return false;
    }


    int m, n, k;
    boolean[][] visited;

    public int movingCountTop(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }

    public int dfs(int i, int j, int si, int sj) {
        if (i >= m || j >= n || k < si + sj || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj) + dfs(i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8);
    }


    /**
     * description  输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     * @author aost
     * time 1  70%  arm  70%
     * date 15:02 2021/7/21
     * param [head]
     * return int[]
     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] ints = new int[list.size()];
        int l = list.size();
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(--l);
        }
        return ints;
    }


}
