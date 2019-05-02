package day10;

/**
 * 机器人走网格可以使用递归
 * 如果向下走就是求;（x - 1, y )矩阵中机器人的走法
 * 如果向右走就是求：(x , y - 1)矩阵中机器人的走法
 * 使用递归
 * 最后的出口就是矩阵只有一行或者一列的时候，这时机器人只有一种走法。
 */
public class Robot {
    public static int countWay(int x,int y){
        if (x == 1|| y ==1)
            return 1;
        return countWay(x - 1,y) + countWay(x, y - 1);
    }

    /**
     * 动态规划求法
     * 这里将最右列和最下边一列全部初始化为1，因为只有一种走法
     * 而dp[x][y]的走法就等于dp[x+1][y]+dp[x][y+1]
     * @param x
     * @param y
     * @return
     */
    public static int countWay2(int x, int y){
        int[][] dp = new int[x][y];
        for (int i = 0; i < x; i++){
            dp[i][y - 1] = 1;
        }
        for(int j = 0; j < y; j++){
            dp[x - 1][j] = 1;
        }

        for (int i = x - 2; i >= 0; i--){
            for (int j = y - 2; j >= 0; j--){
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        System.out.println(countWay2(3,9));
    }
}

