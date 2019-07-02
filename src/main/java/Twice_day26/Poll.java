package Twice_day26;

import java.util.*;

/**
 * @author abaka
 * @date 2019/7/2 9:56
 */

public class Poll {
    /**
     * 没通过
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            Map<String,Integer> map = new HashMap<String, Integer>();
            int n = in.nextInt();

            for (int i = 0; i < n; i++){
                map.put(in.next(),0);
            }

            int num = in.nextInt();
            int useless = 0;
            Set<String> keys = map.keySet();
            for (int i = 0; i < num; i++){
                String stick = in.next();
                if (keys.contains(stick)){
                    map.put(stick,map.get(stick) + 1);
                }else {
                    useless++;
                }
            }

            Iterator<String> iterator = keys.iterator();
            while (iterator.hasNext()){
                String s = iterator.next();
                System.out.println(s + " : " + map.get(s));
            }
            System.out.println("Invalid : " + useless);
        }
        in.close();
    }

}
