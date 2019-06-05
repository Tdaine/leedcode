package Twice_day14;

import java.util.Scanner;

public class Nicosice {
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
