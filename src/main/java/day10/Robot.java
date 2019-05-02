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
    public static void main(String[] args) {
        System.out.println(countWay(2,2));
    }
}
