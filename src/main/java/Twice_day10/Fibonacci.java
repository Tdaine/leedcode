package Twice_day10;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        if (n < 1 || n > 1000000)
            return;
        double pace = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int pre = 0;
        while (n3 < n){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 < n)
                pre = n3;
        }

        pace = (n - pre) < (n3 - n) ? (n - pre) : (n3 - n);
        System.out.println((int)pace);
    }
}
