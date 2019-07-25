package Twice_day45;


import java.util.*;

/**
 * @author abaka
 * @date 2019/7/25 18:02
 */
public class BrotherWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            String[] dic = new String[n];
            for (int i = 0; i < n; i++){
                dic[i] = in.next();
            }
            String brother = in.next();
            int num = in.nextInt();
            int count = 0;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++){
                if (!dic[i].equals(brother)){
                    String temp = dic[i];
                    int j = 0;
                    for (j = 0; j < brother.length(); j++){
                        if (temp.contains(brother.substring(j,j+1))){
                            temp = temp.replaceFirst(brother.substring(j,j+1),"");
                        }else {
                            break;
                        }
                    }
                    if (j == brother.length() && temp.length() == 0){
                        list.add(dic[i]);
                        count++;
                    }
                }
            }
            System.out.println(count);
            Collections.sort(list);
            if (count >= num)
                System.out.println(list.get(num - 1));
        }
;    }
}
