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

    public static void solution(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String[] strs = str.split(" ");
            int[] arr = new int[strs.length];
            for (int i = 0; i < arr.length; i++){
                arr[i] = Integer.valueOf(strs[i]);
            }
            int num = arr[0];
            int count = 0;
            for (int j = 1; j < arr.length; j++){
                if (arr[j] == num){
                    count++;
                }else if (count > 0){
                    count--;
                }else {
                    num = arr[j];
                }
            }
            System.out.println(num);
        }
    }
}
