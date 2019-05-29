package Twice_day09;

import java.util.Scanner;

public class ZeroAtEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if (n < 1 && n > 1000)
                return;
            double multiple = 1;
            for (int i = n; i > 0; i--){
                multiple *= i;
            }
            System.out.println(multiple);
            int count = 0;
            int i = 10;
            while (multiple % i == 0){
                count++;
                i *= 10;
            }
            System.out.println(count);
        }
    }
}
