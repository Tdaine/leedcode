package Twice_day29;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/7 14:37
 */
public class AddEqualSum {
    static int total = 0;
    static int[] arr;
    static int N;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int sum = in.nextInt();
        arr = new int[N];
        if (N < 1 || N > 1000)
            return;
        for (int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }
        count(N - 1,sum);
        System.out.println(total);
    }

    private static void count(int n,int sum){
        if (sum == 0){
            total++;
            return ;
        }

        if (sum < 0 || (sum > 0 && n < 0)){
            return;
        }

        count(n - 1,sum - arr[n]);

        count(n - 1,sum);
    }
}
