package Twice_day26;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/2 9:33
 */


public class add {

    /**
     * 通过
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int total_1 = count(n);
            int total_2 = count((int)Math.pow(n,2));
            System.out.println(total_1 + " " + total_2);
        }
    }

    private static int count(int n){
        int total = 0;
        while (n != 0){
            total += (n % 10);
            n = n / 10;
        }
        return total;
    }
}
