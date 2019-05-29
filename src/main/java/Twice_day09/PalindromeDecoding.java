package Twice_day09;

import java.util.Scanner;

public class PalindromeDecoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(in.nextLine());
        int n = in.nextInt();
        while (n-- > 0){
            int left = in.nextInt();
            int right = left + in.nextInt();
            sb.append(new StringBuffer(sb.toString().substring(left,right)).reverse());
        }
        System.out.println(sb);
    }
}
