package Twice_day09;

import java.util.Scanner;

public class PalindromeDecoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int n = in.nextInt();
        while (n-- > 0){
            int left = in.nextInt();
            int right = left + in.nextInt();
            String start = str.substring(0,right);
            String mid = str.substring(left,right);
            String end = str.substring(right,str.length());
            StringBuilder sb = new StringBuilder();
            sb.append(start);
            sb.append(new StringBuilder(mid).reverse());
            sb.append(end);
            str = sb.toString();
        }
        System.out.println(str);
    }
}
