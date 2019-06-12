package Twice_day20;

import java.util.Scanner;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        int half = 0;
        int key = 0;
        for (int i = 0; i < n; i++){
            if (half == 0){
                key = gifts[i];
                half++;
            }else {
                if (gifts[i] == key)
                    half++;
                else half--;
            }
        }
        half = 0;
        for (int i = 0; i < n; i++){
            if (gifts[i] == key){
                half++;
            }
        }

        if (half > n / 2)
            return key;
        else return 0;
    }
}