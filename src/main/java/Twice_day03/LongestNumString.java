package Twice_day03;

import java.util.*;

public class LongestNumString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        int flage = 0;
        for (int i = 0; i < str.length(); i++){
            int n = str.charAt(i) - '0';
            if (n >= 0 && n < 10){
                if (flage == 0){
                    hashMap.put(i,1);
                    flage = i + 1;
                }else {
                    hashMap.put(flage - 1,hashMap.get(flage - 1) + 1);
                }
            }else {
                flage = 0;
            }
        }

        int max = 0;
        int i = 0;
        for (int key : hashMap.keySet()){
            if (hashMap.get(key) > max){
                max = hashMap.get(key);
                i = key;
            }
        }
        System.out.println(str.substring(i,i + hashMap.get(i)));
    }
}
