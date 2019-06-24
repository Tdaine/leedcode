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

    //计算最小公倍数
    private static int lcm(int m,int n){
        return (m * n) / gcd(m,n);
    }

    //计算最大公约数
    private static int gcd(int a,int b){
        if (b == 0)
            return a;
        return gcd(b,a % b);
    }

    /**
     * 由于最小公倍数*最大公约数 = a*b
     * 所以可以先求出最大公约数，间接求出最小公倍数
     * 这里使用欧几里得算法（辗转相除法）求最大公约数，具体步骤如下：
     *  1. a/b，令r为所得余数（0≤r<b） 若r=0，算法结束，a即为答案
     * 2. 互换：置 a←b，b←r，并返回第一步
     * @param args
     */
    public static void solution1(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(lcm(a,b));
    }
}
