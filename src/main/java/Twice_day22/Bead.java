package Twice_day22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bead {
    /**
     * 此方法是使用字符串方法之间的套用解决问题
     * 以用户手中的字符串为标准进行循环
     * 使用substring()方法截取出用户手当前循环的字符，使用字符串的contains()方法计算商人手中是否存在此字符
     * 如果存在：使用replaceFirst()方法删除掉商人字符转中的第一个这个字符
     * 如果不存在：标志着商人缺少多少珠子的变量count++，并且改变标志位，说明不符合要求
     * 最后在输出是使用标志位判断是否符合要求输出Yes/No
     * 输出Yes只需要计算出商人手中剩余的珠子数
     * 输出No直接输出变量count，就代表商人缺少的珠子数量
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            int flage = 1;
            int count = 0;
            for (int i = 0; i < str2.length();){
                if (str1.contains(str2.substring(i,i + 1))){
                    str1 = str1.replaceFirst(str2.substring(i, i+1),"");
                }else {
                    count++;
                    flage = -1;
                }
                i++;
            }

            if (flage == 1){
                System.out.println("Yes" + " " + str1.length());
            }else {
                System.out.println("No" + " " + count);
            }
        }
    }

    /**
     * 该方法使用hashMap，
     * 1.将商人的珠子放入桶中并进行计算value
     * 2.将用户的珠子放入桶中并进行计算value
     * 3.用用户手中的珠子参考标准去匹配商人手中的珠子，
     * 如果商人手中存在这个珠子进行珠子个数的对比
     *      如果珠子的个数少于用户手中的个数则表示不符合条件，同时计算出缺少多少个珠子
     *      如果珠子的个数大于用户手中的个数则表示此珠子满足
     * 如果商人手中不存在这个珠子
     *      表示不符合要求，并将用户手中此珠子的数量加到商人缺少的珠子个数中
     *
     */
    public static void solution(){
        Scanner in = new Scanner(System.in);

        String have = in.nextLine();
        String need = in.nextLine();

        //商人手中每个珠子的数量统计
        Map<Character,Integer> h = new HashMap<Character, Integer>();

        for (char c : have.toCharArray()){
            if (h.containsKey(c)){
                h.put(c,h.get(c) + 1);
            }else {
                h.put(c,1);
            }
        }

        //用户手中每个珠子的数量统计
        Map<Character,Integer> n = new HashMap<Character, Integer>();

        for (char c: need.toCharArray()){
            if (n.containsKey(c)){
                n.put(c,n.get(c) + 1);
            }else n.put(c,1);
        }

        //计算差值
        boolean weatherBy = true;
        int lack = 0;
        for (Map.Entry<Character,Integer> en : n.entrySet()){
            char k = en.getKey();
            int v = en.getValue();
            if (h.containsKey(k) && h.get(k) < v){
                weatherBy = false;
                lack += v - h.get(k);
            }else if (!h.containsKey(k)){
                weatherBy = false;
                lack += v;
            }
        }
        if (weatherBy){
            System.out.println("Yes" + " "+ (have.length() - need.length()));
        }else {
            System.out.println("No" + " " + lack);
        }
    }
}

