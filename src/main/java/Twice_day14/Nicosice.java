package Twice_day14;

import java.util.Scanner;

public class Nicosice {
    /**
     * 1^3=1
     * 2^3=3+5
     * 3^3=7+9+11
     * 4^3=13+15+17+19
     * 观察规律，总结归纳，连续奇数求和就是等差数列求和，难点立即转换为等差数列的首项，得出首项 a = m*(m-1)+1
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int a = n * n - n + 1;
            System.out.print(a);
            for (int i = 1; i < n; i++){
                System.out.print("+"+(a += 2));
            }
            System.out.println();
        }

    }
}
