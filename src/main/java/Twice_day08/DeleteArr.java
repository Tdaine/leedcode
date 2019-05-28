package Twice_day08;

import java.util.Scanner;

public class DeleteArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if (n >= 1000)
                n = 999;
            int[] arr = new int[n];
            int flag = 0;
            int count = 0;
            for (int i = 0; ; i++){
                if (i == n)
                    i = 0;
                if (arr[i] != -1){
                    flag++;
                }
                if (flag == 3){
                    arr[i] = -1;
                    flag = 0;
                    if (count == n -1){
                        System.out.println(i);
                        break;
                    }else count++;
                }
            }
        }
    }
}
