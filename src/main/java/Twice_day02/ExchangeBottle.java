package Twice_day02;

import java.util.Scanner;

public class ExchangeBottle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if (n == 0)
                break;
            else if (n >= 1 && n <= 100){
                int count = 0;
                int exchange = 0;
                while (n >= 2){
                    if (n == 2){
                        n++;
                    }
                    exchange = n / 3;
                    count += exchange;
                    n = n % 3 + exchange;
                }
                System.out.println(count);
            }
        }
    }
}
