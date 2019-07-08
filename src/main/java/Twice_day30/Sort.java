package Twice_day30;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/8 13:38
 */
public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            BigInteger[] bigIntegers = new BigInteger[n];
            for (int i = 0; i < n; i++){
                bigIntegers[i] = in.nextBigInteger();
            }
            Arrays.sort(bigIntegers);

            for (int i = 0; i < n; i++){
                System.out.println(bigIntegers[i]);
            }
        }
    }
}
