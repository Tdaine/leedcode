package Twice_day21;


import java.util.Scanner;

public class Rabbit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int month = in.nextInt();
            System.out.println(rabbit(month));
        }
        in.close();
    }

    public static int rabbit(int n){
        if (n <= 2)
            return 1;
        else
            return rabbit(n - 1) + rabbit(n - 2);
    }
}
