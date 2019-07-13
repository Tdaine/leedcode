package Twice_day34;

import java.util.*;

/**
 * @author abaka
 * @date 2019/7/13 9:54
 */
public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String[] arrStr1 = str1.split("_");
        String[] arrStr2 = str2.split("_");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrStr1.length; i++){
            for (int j = 0; j < arrStr2[i].length(); j++ ){
                if (arrStr1[i].contains(arrStr2[i].substring(j,j+1))){
                    arrStr1[i] = arrStr1[i].replaceAll(arrStr2[i].substring(j,j+1),"");
                }
            }

            for (int j = 0; j < arrStr1[i].length(); j++){
                arrStr1[i] = arrStr1[i].toUpperCase();
                if (!stringBuilder.toString().contains(arrStr1[i].substring(j,j+1)))
                {
                    stringBuilder.append(arrStr1[i].substring(j,j+1));
                }

            }
        }

        System.out.print(stringBuilder);

    }
}

