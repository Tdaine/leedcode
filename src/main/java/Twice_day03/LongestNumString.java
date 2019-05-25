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

    /**
     * optimize solution
     *
     * 使用max记录最长的数字串长度，使用end标记出最长数字串长度的末尾，
     * 当字符每次满足数字时，对max进行判断，记录出最大的max;
     * 最后通过字符串截取的方法，使用End和max计算出数字串的位置进行截取输出。
     */
    public static void solution(){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            int max = 0;
            int count = 0;
            int end = 0;
            for (int i = 0; i < str.length();i++){
                if (str.charAt(i) >= '0' && str.charAt(i) >= '9'){
                    count++;
                    if (max < count){
                        max = count;
                        end = i;
                    }
                }else
                    count = 0;
            }
            System.out.println(str.substring(end - max + 1, end + 1));
        }
    }
}
