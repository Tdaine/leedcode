package Twice_day11;

import java.util.*;

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

    public static void solution2(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.next();
        char[] chars = N.toCharArray();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            list.add(0);
        }

        for (int i = 0; i < 10; i++){
            list.set(chars[i] - '0',list.get(chars[i] - '0') + 1);
        }

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > 0)
                System.out.println(i + ":" + list.get(i));
        }
    }

}
