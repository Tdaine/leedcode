package Twice_day16;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] ret = new int[2 * n];
            for (int i = 0; i < 2 * n;i++){
                int temp = i + 1;
                for (int j = 0; j < k; j++){
                    if (temp <= n){
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
