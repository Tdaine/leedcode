package Twice_day04;

import java.util.Scanner;

public class BuyApple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = 0;
        for (int i = 0; i <= n / 8; i++){
            int surplus = n - (i * 8);
            int j = surplus / 6;
            if (surplus % 6 == 0){
                min = i + j;
            }
        }
        if (min != 0)
            System.out.println(min);
        else
            System.out.println(-1);
    }
}
