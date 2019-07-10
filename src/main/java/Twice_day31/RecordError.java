package Twice_day31;

import java.util.*;

/**
 * @author abaka
 * @date 2019/7/10 13:13
 */
public class RecordError {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //这里必须用LinkedHashMap,按插入顺序排序。随后之后会按照出错次数再排序，但如果出错次数一样，还是要按照插入的顺序来
        //所以要使用LinkHashMap
        Map<String,Integer> map = new LinkedHashMap<String, Integer>();
        while (in.hasNext()){
            String path = in.next();
            //获取文件名开始下标
            int id = path.lastIndexOf('\\');
            //找到文件名
            String filename = id == -1 ? path : path.substring(id + 1);
            int line = in.nextInt();
            //统计频率
            String key = filename + " " + line;
            if (map.containsKey(key))
                map.put(key,map.get(key) + 1);
            else
                map.put(key,1);
        }

        //对记录进行排序，这里有一个前提，就是java中的排序用的是归并排序，是稳定排序
        //这样，如果出错次数一样多，仍然保持插入排序
        List<Map.Entry<String,Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        //只输出前8条
        int m = 0;
        for (Map.Entry<String,Integer> mapping : list){
            if (m >= 8)
                break;

            String[] str = mapping.getKey().split(" ");
            String filename = str[0];

            //如果长度大于16，只输出后16个字符
            if (filename.length() > 16)
                filename = filename.substring(filename.length() - 16);
            String n = str[1];
            Integer count = mapping.getValue();
            System.out.printf("%s %s %d%n",filename,n,count);
            m++;
        }
    }
}
