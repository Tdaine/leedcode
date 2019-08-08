package Twice_day16;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Shuffle {
    /**
     * 思路：
     * 找规律，总共有2n张牌，分为上n张和下n张，
     * 上n张(左手)的牌，在洗牌过程中下标的变化规律是：2*当前位置 - 1   这里的当前位置是下标从1开始的
     * 下n张(右手)的牌，在洗牌过程中下标的变化规律是：2*(当前位置 - n)
     *
     * 所以就可以直接读取一个元素，进行k次洗牌，每次判断下标的范围，计算洗牌后的位置，得到最后结果
     * 依次将所有的元素重复上面过程，就是最后的洗牌结果
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();//数组组数
        while (T-- > 0){
            int n = in.nextInt();//数字个数的一半
            int k = in.nextInt();//洗牌次数
            int[] ret = new int[2 * n];//总数
            for (int i = 0; i < 2 * n;i++){//遍历所有牌
                int temp = i + 1;//牌的下标从1开始
                for (int j = 0; j < k; j++){//洗牌的次数
                    if (temp <= n){//判断现在这张牌是左手还是右手
                        temp = 2 * temp - 1;
                    }else {
                        temp = 2 * (temp - n);
                    }
                }
                ret[temp - 1] = in.nextInt();
            }

            if (ret.length != 0)
                System.out.print(ret[0]);
            for (int i = 1; i < ret.length; i++)
                System.out.print(" " + ret[i]);
            System.out.println();
        }
    }
}
