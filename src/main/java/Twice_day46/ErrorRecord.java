package Twice_day46;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/27 18:52
 */
public class ErrorRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();

        while (scanner.hasNext()){
            String str = scanner.next();
            int line = scanner.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length - 1];
            if (s.length() > 16)
                s = s.substring(s.length() - 16);
            String key = s + " " + line;
            if (map.containsKey(key))
                map.put(key,map.get(key) + 1);
            else
                map.put(key,1);
        }

        int count = 0;
        for (String s : map.keySet()){
            count++;
            if (count > (map.keySet().size() - 8))
                System.out.println(s + " " + map.get(s));
        }
    }
}
