package Twice_Day44;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/24 18:12
 */
public class CToJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str1 = in.nextLine();
            //String str2 = in.nextLine();
            String[] arr1 = str1.split("_");
            //String[] arr2 = str2.split("_");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr1.length; i++){
                if (i == 0){
                    sb.append(arr1[i]);
                }else {
                    sb.append(arr1[i].substring(0,1).toUpperCase());
                    sb.append(arr1[i].substring(1));
                }
            }
            System.out.println(sb.toString());
        }
        in.close();
    }
}
