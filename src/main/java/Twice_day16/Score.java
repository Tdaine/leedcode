package Twice_day16;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if (n == 0)
                return;
            int[] score = new int[n];
            for (int i = 0; i < n; i++){
                score[i] = in.nextInt();
            }
            int key = in.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++){
                if (score[i] == key)
                    count++;
            }
            System.out.println(count);
        }
    }
}
