package Twice_day18;

import java.util.Scanner;

public class GC0Ratio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = in.nextInt();
        int index = 0;
        int max = 0;
        for (int i = 0; i < str.length() - n; i++){
            int count = 0;
            for (int j = i; j < i + n; j++){
                if (str.charAt(j) == 'G' || str.charAt(j) == 'C'){
                    count++;
                }
            }

            if (count > max){
                max = count;
                index = i;
            }
        }
        for (int i = index; i < index + n; i++){
            System.out.print(str.charAt(i));
        }
    }
}
