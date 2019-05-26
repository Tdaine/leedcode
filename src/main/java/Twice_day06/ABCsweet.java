package Twice_day06;

import java.util.Scanner;

public class ABCsweet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();

        if (n1 < -30 || n1 > 30 || n2 < -30 || n2 > 30 || n3 < -30 || n3 > 30 || n4 <=-30 || n4 > 30)
            return;

        int A,B,C;
        if ((n1 + n3) % 2 == 0)
            A = (n1 + n3) / 2;
        else {
            System.out.println("No");
            return;
        }
        if ((n2 + n4) % 2 == 0)
            B = (n2 + n4) / 2;
        else {
            System.out.println("No");
            return;
        }
        if (A < 0 || B < 0)
        {
            System.out.println("No");
            return;
        }

        C = n4 - B;

        System.out.println(A + " " + B + " " + C);
    }
}
