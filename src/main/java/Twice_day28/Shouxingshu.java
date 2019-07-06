package Twice_day28;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/6 16:04
 */
public class Shouxingshu {
    /**
     * 思路：
     * 1.取得平方数和原数字
     *
     * 2.将两种数转换为字符串
     *
     * 3.截取平方数中的低位和原数字比较
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int ret = n * n;
            String str1 = String.valueOf(n);
            String str2 = String.valueOf(ret);
            String s = str2.substring(str2.length() - str1.length(),str2.length());
            if (s.equals(str1))
                System.out.println("Yes!");
            else
                System.out.println("No!");
        }
    }
}
