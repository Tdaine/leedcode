package Twice_day05;

import java.util.Scanner;

public class Pocket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            count += count(arr,i,0);
        }
        System.out.println(count);
    }

    private static int count(int[] arr,int i,int cun){

        if (i >= arr.length)
            return 0;
        if (cun == 40){
            cun =cun - arr[i - 1];
            return 1 + count(arr,i,cun);
        }
        if (cun > 40){
            cun =cun - arr[i - 1];
            return 0 + count(arr,i,cun);
        }

        cun =cun + arr[i];
        return count(arr,i + 1,cun);
    }
}
