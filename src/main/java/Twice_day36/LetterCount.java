package Twice_day36;

import java.util.*;

/**
 * @author abaka
 * @date 2019/7/15 17:30
 */
public class LetterCount {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            Map<Character,Integer> map = new TreeMap<Character, Integer>();
//            for (char c = 'A'; c <= 'Z'; c++){
//                map.put(c,0);
//            }
//            for (int i = 0; i < str.length(); i++){
//                char c = str.charAt(i);
//                if (c >= 'A' && c <= 'Z'){
//                    if (map.containsKey(c)){
//                        map.put(c,map.get(c) + 1);
//                    }else {
//                        map.put(c,1);
//                    }
//                }
//            }
//            Set<Map.Entry<Character,Integer>> set = map.entrySet();
//            Iterator<Map.Entry<Character,Integer>> iterator = set.iterator();
//            while (iterator.hasNext()){
//                Map.Entry<Character,Integer> entry = iterator.next();
//                System.out.println(entry.getKey() + ":" + entry.getValue());
//            }
//        }
        solutionTwo();
    }

    public static void solutionTwo(){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String line = in.nextLine();
            int[] count = new int[26];
            for (int i = 0; i <line.length(); i++){
                char ch = line.charAt(i);
                if (ch >= 'A' && ch <= 'Z'){
                    count[ch - 'A']++;
                }
            }
            for (int i = 0; i < 26; i++){
                System.out.printf("%c:%d\n",('A' + i),count[i]);
            }
        }
    }
}
