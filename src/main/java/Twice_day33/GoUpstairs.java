package Twice_day33;

/**
 * @author abaka
 * @date 2019/7/12 11:26
 */
public class GoUpstairs {

    /**
     * 思路：
     * 第一阶有一种走法
     * 第二阶有两种走法：1+1 2
     * 第三阶有四种走法：1+1+1 1+2 2+1 3
     * 第四阶之后的台阶n就可以想成是
     * (n-1) + 1
     * (n-2) + 2
     * (n-3) + 3
     * 所以step[n] = step[n-1] + step[n-2] + step[n-3]
     * 这个和斐波那契有类似
     * 可以使用递归也可以使用动态规划
     * 这里递归会出现超时，所以动态规划最好
     * @param n
     * @return
     */
    public int countWays(int n) {
        // write code here
        long[] way = {1,2,4};
        if (n <= 0)
            return 0;
        else if (n <= 3)
            return (int)way[n - 1];
        else {
            for (int i = 4; i <= n; i++){
                long temp = (way[0] + way[1] +way[2]) % 1000000007;
                way[0] = way[1];
                way[1] = way[2];
                way[2] = temp;
            }
        }
        return (int)way[2];
    }

    /**
     * 两种方法中防止溢出的处理不一样
     * @param n
     * @return
     */
    public int countWays2(int n){
        int[] way = {1,2,4};
        if (n <= 0)
            return 0;
        else if (n <= 3)
            return way[n - 1];
        else {
            for (int i = 4; i <= n; i++){
                int temp = ((way[0] + way[1])% 1000000007 +way[2]) % 1000000007;
                way[0] = way[1];
                way[1] = way[2];
                way[2] = temp;
            }
        }
        return way[2];
    }

}
