package Twice_day45;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/25 17:43
 */
public class PingPang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String str1 = str.split(" ")[0];
            String str2 = str.split(" ")[1];
            int i = 0;
            for (i = 0; i < str2.length(); i++){
                if (str1.contains(str2.substring(i,i + 1))){
                    str1 = str1.replaceFirst(str2.substring(i,i+1),"");
                }else {
                    System.out.println("No");
                    break;
                }
            }
            if (i == str2.length())
                System.out.println("Yes");
        }
        in.close();
    }
}
