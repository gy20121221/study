package aost.ms;

public class AText7 {
    public static void main(String[] args) {

    }
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    public int climbStairs (int n) {
        // write code here
        int[] dp = new int[100000];
        dp[1] = 1;
        dp[2] = 2;
        for( int i = 3;i <= n;++i ){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    //给你两个二进制字符串，返回它们的和（用二进制表示）
    //输入为 非空 字符串且只包含数字 1 和 0。
    public String addBinary (String a, String b) {
        // write code here
        String result = "";
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int sum = 0;
        while(aLen>=0 || bLen>=0){
            if(aLen>=0){
                sum +=Integer.parseInt(a.substring(aLen,aLen+1));
                aLen--;
            }
            if(bLen>=0){
                sum +=Integer.parseInt(b.substring(bLen,bLen+1));
                bLen--;
            }
            if(sum==2){
                result = "0" + result;
                sum=1;
            }else if(sum==0 || sum==1) {
                result = sum +"" + result;
                sum = 0;
            }else if(sum==3){
                result = "1" + result;
                sum = 1;
            }
        }
        if(sum==1)
            result = "1" + result;
        return result;
    }




}
