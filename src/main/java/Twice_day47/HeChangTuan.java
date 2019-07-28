package Twice_day47;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/28 17:53
 */
public class HeChangTuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        int d = in.nextInt();
        long[][] f= new long[n + 1][k + 1];

        //创建最大，最小两个辅助数组。一个保存正数情况，一个保存负数情况
        long[][] big = new long[n + 1][k + 1];
        long[][] small = new long[n + 1][k + 1];

        //big[i][j]表示：前i个中选择j个的积最大，包含当前元素
        for (int i = 1; i <= n; i++){
            big[i][1] = arr[i];
            small[i][1] = arr[i];
        }

        for (int curK = 2; curK <= k; curK++){
            for (int curN = curK; curN <= n; curN++){
                long tempMax = Long.MIN_VALUE;
                long tempMin = Long.MAX_VALUE;

                //left >= curN - d  : 表示left必须满足相邻两个学生的位置编号不能超多d
                //left >= curK - 1 ：表示当前需要选择k - 1个学生，那么当前学生的下标必须 >= k -1，
                for (int left = curN - 1; left >= curN - d && left >= curK - 1;left--){
                    if (tempMax < Math.max(big[left][curK - 1] * arr[curN],small[left][curK - 1] * arr[curN]))
                        tempMax = Math.max(big[left][curK - 1] * arr[curN],small[left][curK - 1] * arr[curN]);
                    if (tempMin > Math.min(big[left][curK - 1] * arr[curN],small[left][curK - 1] * arr[curN]))
                        tempMin = Math.min(big[left][curK - 1] * arr[curN],small[left][curK - 1] * arr[curN]);
                }
                big[curN][curK] = tempMax;
                small[curN][curK] = tempMin;
            }
        }
        long maxResult = Long.MIN_VALUE;
        for (int i = k; i <= n; i++){
            if (big[i][k] > maxResult)
                maxResult = big[i][k];
        }
        System.out.println(maxResult);
    }
}
