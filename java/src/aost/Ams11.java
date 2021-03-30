package aost;

public class Ams11 {
    public static void main(String[] args) {

    }
    //环形路上有n个加油站，第i个加油站的汽油量是gas[i].
    //你有一辆车，车的油箱可以无限装汽油。从加油站i走到下一个加油站（i+1）花费的油量是cost[i]，你从一个加油站出发，刚开始的时候油箱里面没有汽油。
    //求从哪个加油站出发可以在环形路上走一圈。返回加油站的下标，如果没有答案的话返回-1。
    //注意：
    //答案保证唯一。
    //从start出发， 如果油量足够， 可以一直向后走 end++；  油量不够的时候，
    //start向后退  最终 start == end的时候，如果有解一定是当前 start所在位置
    public int canCompleteCircuit (int[] gas, int[] cost) {
        // write code here
        int start = gas.length - 1;
        int end = 0;
        int sum = gas[start] - cost[start];
        while(start > end){
            if(sum >= 0){
                sum += gas[end] - cost[end];
                ++end;
            }else{
                --start;
                sum += gas[start] - cost[start];
            }
        }
        return sum >=0 ? start : -1;
    }
}
