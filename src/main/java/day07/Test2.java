package day07;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(lcm(a,b));
    }

    public static int lcm(int m ,int n){
        return (m * n)/gcd(m ,n);
    }

    /**
     * 最小公倍数 = 两数之积除以最大公约数
     * @param a
     * @param b
     * @return
     */
    private static int gcd(int a,int b){
        if (b == 0)
            return a;
        return gcd(b,a % b);
    }
}
