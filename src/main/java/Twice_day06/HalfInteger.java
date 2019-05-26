package Twice_day06;

import java.util.Scanner;

public class HalfInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = in.nextLine().toCharArray();
        int flag = 0;
        int count = 0;
        if (arr.length > 100)
            return;
        for (int i = 0; i < arr.length; i += 2){
            if (count == 0)
                flag = arr[i];
            if (arr[i] == flag)
                count++;
            else {
                count--;
            }
        }
        System.out.println(flag - '0');
    }
}
