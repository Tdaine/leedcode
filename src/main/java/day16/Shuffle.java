package day16;

import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int groups = in.nextInt();
        while (groups-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] ret = new int[2 * n];
            for (int i = 0; i < 2 * n; i++){
                 int temp = i + 1;
                 for (int j = 0; j < k; j++){
                     if (temp <= n)
                         temp = 2 * temp - 1;
                     else temp = 2 * (temp - n);
                 }
                 ret[temp - 1] = in.nextInt();
            }
            if (ret.length > 0)
                System.out.println(ret[0]);
            for (int i = 1; i < 2 * n; i++){
                System.out.println(" " + ret[i]);
            }
            System.out.println();
        }
    }
}
