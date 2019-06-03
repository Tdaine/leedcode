package Twice_day13;


import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char c = in.next().charAt(0);
        int row = n / 2 + n % 2;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < n; j++){
                if (j == 0 || j == n - 1 || i == 0 || i == row - 1){
                    System.out.print(c);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
