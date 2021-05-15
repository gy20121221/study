package aost.leetCode;

/**
 * @ClassName: a2
 * @Description: 给定一个数组 prices ，prices[i] 是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * @Author aost
 * @Date 2021/5/13
 * @Version 1.0
 */
public class a2 {
   /**
    * @Author aost
    * @Description 计算你所能获取的最大利润
    * @Date  2021/5/13
    * @Param [prices]
    * @Return int
    * @MethodName maxProfit
    */
    public static int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 0) return 0;
        for (int i = 1; i < prices.length; i++) {
           if (prices[i]>prices[i-1]) profit+=prices[i]-prices[i-1];
        }
        return profit;
    }
}
