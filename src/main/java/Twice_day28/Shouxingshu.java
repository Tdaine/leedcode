package Twice_day28;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/6 16:04
 */
public class Shouxingshu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int n = in.nextInt();
//            if (n >= 2 && n < 100){
//                int ret = (int)Math.pow(n,2);
//                int flag = 1;
//                while (n % 10 != 0){
//                    if (n % 10 != ret % 10){
//                        flag = -1;
//                    }
//                    n = n / 10;
//                    ret = ret / 10;
//                }
//                if (flag == -1)
//                    System.out.println("No!");
//                else
//                    System.out.println("Yes!");
//            }
//        }
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
