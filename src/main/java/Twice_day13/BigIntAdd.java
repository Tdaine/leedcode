package Twice_day13;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/8/7 11:56
 */
public class BigIntAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.next();
            String s2 = in.next();
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}
