package Twice_day07;

import java.util.Scanner;

public class NoneTwo {
    /**
     * soution1使用的方法是将行和列分开计算；
     * 根据题目要求画图可以看出来这个图案是有规律的，
     * 将计算分为row0+row1和row2+row3；
     * 使用行计算出一共有多少个row01,然后使用(row / 4) * 2计算，
     *      最后在加上余出的几行((row % 4) <= 2 ? (row % 4) : 2);最后的结果就是每列中有多少row01
     * row23和row01的计算方式一样。
     * 最后计算出一共有多少个4行，因为每4行就有(row01 + row23) * 2个蛋糕，所以一共有(col / 4) * (row01 + row23) * 2
     *
     * 最后的最后将行余出的进行单独处理就可以了
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int row01 = (row / 4) * 2 + ((row % 4) <= 2 ? (row % 4) : 2);
        int row23 = ((row - 2) / 4) * 2 + (((row - 2) % 4) <= 2 ? ((row - 2) % 4) : 2);

        int count = (col / 4) * (row01 + row23) * 2;

        if (col % 4 >= 1)
            count += row01;
        if (col % 4 >= 2)
            count += row01;
        if (col % 4 >= 3)
            count += row23;

        System.out.println(count);
    }

    /**
     * solution2的解决方法：
     * 先创建一个二维数组初始值为0,遍历整个数组当满足不是-1就代表可以放置蛋糕count++；
     * 然后将这个位置包含的所有和它可以满足'欧几里得'的位置置为-1；
     * 这样遍历一遍整个数组就可以得出有多少位置可以放置蛋糕
     */
    public static void solution2( ) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        int count = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (arr[i][j] != -1){
                    count++;
                    if (i + 2 < row){
                        arr[i + 2][j] = -1;
                    }
                    if (j + 2 < col)
                        arr[i][j + 2] = -1;
                }
            }
        }
        System.out.println(count);
    }

    /**
     * solution3方法:我自己认为这是最烧脑的方法，反正我是看了很多遍
     * 这个方法就是将整个图找规律，发现如果是4的倍数行或者4的倍数列蛋糕数就刚好是表格的一半
     * 否则如果是2的倍数列和2的倍数行（不能是4的倍数）蛋糕数就是表格的一半多出来两个
     * 剩下的情况就是表格的一半多出来一个；
     * 至于是最初怎么看出来的我也就不太清楚了，我是自己画了一个8*8的图一个一个试了一下，发现就是这样的；
     */
    public static void solution3( ) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int count = 0;
        if (row % 4 == 0 || col % 4 == 0)
            count = (row * col) / 2;
        else if (row % 2 == 0 && col % 2 == 0)
            count = (row * col) / 2 + 2;
        else count = (row * col) / 2 + 1;
        System.out.println(count);
    }
}
