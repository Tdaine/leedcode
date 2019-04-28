package day09;

import java.util.Scanner;

/**
 * 列三元二次方程组进行化简：
 * 5x + 3y + z/3 = 100
 * x + y +z = 100
 * 化简得：
 * 7x + 4y = 100
 * z = 100 - x - y
 */
public class BuyChicken {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
           for (int n1 = 0; n1 < 14; n1++){
               for (int n2 = 0; n2 <= 25; n2++){
                   if (7 * n1 + 4 * n2 == 100){
                       int n3 = 100 - n1 - n2;
                       System.out.println(n1 + " " + n2 + " " + n3);
                   }
               }
           }
        }
    }
}
