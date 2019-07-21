package Twice_day41;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/21 17:39
 */
public class MaxAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int[] F = new int[n];
        F[0] = arr[0];
        int max = F[0];
        for (int i = 1; i < n; i++){
            F[i] = Math.max(arr[i],F[i - 1] + arr[i]);
            if (F[i] > max)
                max = F[i];
        }
        System.out.println(max);
    }
}
