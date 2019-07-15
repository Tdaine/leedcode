package Twice_day36;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/15 17:54
 */
public class SixteenToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String line = in.next();
            int num = 0;
            for (int i = 2; i < line.length(); i++){
                char c = line.charAt(i);
                int ten = 0;
                if (c >= 'A' && c <= 'F'){
                    ten = c - 'A' + 10;
                }else if (c >= 'a' && c <= 'f'){
                    ten = c - 'a' + 10;
                }else {
                    ten = c - '0';
                }
                num *= 16;
                num += ten;
            }
            System.out.println(num);
        }
    }
}
