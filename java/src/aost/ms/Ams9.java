package aost.ms;


/**
 * 给你一个数组 routes ，表示一系列公交线路，其中每个 routes[i] 表示一条公交线路，第 i 辆公交车将会在上面循环行驶。
 * <p>
 * 例如，路线 routes[0] = [1, 5, 7] 表示第 0 辆公交车会一直按序列 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... 这样的车站路线行驶。
 * 现在从 source 车站出发（初始时不在公交车上），要前往 target 车站。 期间仅可乘坐公交车。
 * <p>
 * 求出 最少乘坐的公交车数量 。如果不可能到达终点车站，返回 -1 。
 */
public class Ams9 {
    public static void main(String[] args) {


    }

    static int sum = 0;

    public static int numBusesToDestination(int[][] routes, int source, int target) {

        int[] sou = new int[1000000];
        sou[0] = source;
        for (int[] route : routes) {
            sum = sd(route, sou, target);
        }


        return sum;
    }

    private static int sd(int[] route, int[] sou, int target) {
        for (int i = 0; i < route.length; i++) {
            if (route[i] == target) return sum;

        }
        return sum;
    }


}
