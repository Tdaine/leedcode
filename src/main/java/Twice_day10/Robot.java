package Twice_day10;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/6/27 19:33
 */
public class Robot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(countWays(x,y));
    }

    /**
     * 采用递归的思路
     * 机器人在X*Y的矩阵中走，每一步都有两种选择：要么向下、要么向右。 如果向下走，问题就变成：求(X-1)*Y
     * 矩阵中机器人的走法； 如果向右走，问题就变成：求X*(Y-1)矩阵中机器人的走法； 显然是递归的思
     * 想！ 既然是递归，再考虑退出条件：当整个矩阵只有一行 或 一列的时候只有一种走法。
     * @param x
     * @param y
     * @return
     */
    private static int countWays(int x,int y){
        if (x == 1 || y == 1){
            return 1;
        }
        return countWays(x - 1,y) + countWays(x, y -1);
    }

    /**
     * 使用动态规划
     * 将数组的右边和下边边框初始化为1，因为到了边框部分就只有一种走法
     * 从右下角向左上角动态变化，因为map[x -1][y -1]和map[x][y - 1],map[x -1][y]固定都是为1的
     * 所以就从map[x-2][y-2]开始计算，假设机器人走到map[x-2][y-2]这个坐标处那么表示他只有map[x][y - 1]和map[x -1][y]这两条路走
     * 那么就表示着只需要将map[x][y - 1],map[x -1][y]可能出现的路径情况相加就是map[x-2][y-2]这个坐标处的路径情况，
     * 以此类推向左上角依次遍历整个数组最后map[0][0]坐标处的路径条数就是map[1][0]和map[0][1]处的路径条数之和。
     * @param x
     * @param y
     * @return
     */
    private static int countWays2(int x,int y){
        int[][] map = new int[x][y];

        //将数组最后一列初始化为1
        for (int i = 0; i < x; i++){
            map[i][y - 1] = 1;
        }
        //将数组最后一行初始化为1
        for (int j = 0; j < y; j++){
            map[x - 1][j] = 1;
        }

        //动态规划处理
        for (int i = x - 2; i >= 0; i--){
            for (int j = y - 2; j >= 0; j--){
                map[i][j] = map[i + 1][j] + map[i][j + 1];
            }
        }

        return map[0][0];
    }
}
