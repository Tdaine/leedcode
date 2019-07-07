package Twice_day29;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/7 14:37
 */
public class AddEqualSum {

    /**
     * 详解：https://blog.csdn.net/qq_39032310/article/details/95004402
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = in.nextInt();
        int[] arr = new int[n + 1];
        long[][] dp = new long[n + 1][sum + 1];
        for (int i = 0; i <= n;i++){
            dp[i][0] = 1;
        }
        for (int j = 1; j <= sum; j++){
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++){
            arr[i] = in.nextInt();
            for (int j = 0; j <= sum; j++){
                if (j >= arr[i])
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i]];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        System.out.println(dp[n][sum]);
    }

    //下面这是一种优化方法，将二维数组的动态规划优化为一维数组，
    //关键点是在内层for循环中，这里是从后向前循环的，所以可以使用一维数组。
    //因为j < arr[i]的情况和之前的情况一样，所以就直接使用一维数组中之前所保存的数

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int sum = in.nextInt();
//        int[] value = new int[n];
//        long[] dp = new long[sum + 1];
//        dp[0] = 1;
//        for (int i = 0; i < n; i++){
//            value[i] = in.nextInt();
//            for (int j = sum; j >= 0; j--){
//                if (j >= value[i]){
//                    dp[j] += dp[j - value[i]];
//                }
//            }
//        }
//        System.out.println(dp[sum]);
//    }

}
