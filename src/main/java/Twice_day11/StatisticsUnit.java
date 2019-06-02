package Twice_day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StatisticsUnit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character,Integer> hashMap = new HashMap<Character, Integer>();

            String s = in.nextLine();
            for (int i = 0; i < s.length(); i++){
                if (hashMap.get(s.charAt(i)) == null){
                    hashMap.put(s.charAt(i),1);
                }else {
                    hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
                }
            }
        for (Map.Entry<Character,Integer> map : hashMap.entrySet()){
            if (map.getValue() != 0){
                System.out.println(map.getKey() + ":" + map.getValue());
            }
        }
    }
}
