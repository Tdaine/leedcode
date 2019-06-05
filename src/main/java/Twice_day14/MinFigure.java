package Twice_day14;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class MinFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++){
            num[i] = in.nextInt();
        }

        for (int i = 1; i < 10; i++){
            if (num[i] != 0){
                System.out.print(i);
                num[i]--;
                break;
            }
        }

        for (int i = 0; i < 10;i++){
            while (num[i] != 0){
                System.out.print(i);
                num[i]--;
            }
        }
    }
}
