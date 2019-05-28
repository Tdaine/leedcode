package Twice_day07;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int max = 0;
        if (A > B)
            max = A;
        else max = B;
        int min = 0;
        for (int i = A*B; i >= B; ){
            if (i % A == 0 && i % B == 0){
                min = i;
                i = i - B;
            }else if (i % B == 0){
                i = i - B;
            }else i = i - 1;
        }
        System.out.println(min);
    }
}
