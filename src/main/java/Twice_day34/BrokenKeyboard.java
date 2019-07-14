package Twice_day34;

import java.util.*;

/**
 * @author abaka
 * @date 2019/7/13 9:54
 */
public class BrokenKeyboard {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str1 = in.nextLine();
//        String str2 = in.nextLine();
//        String[] arrStr1 = str1.split("_");
//        String[] arrStr2 = str2.split("_");
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < arrStr1.length; i++){
//            for (int j = 0; j < arrStr2[i].length(); j++ ){
//                if (arrStr1[i].contains(arrStr2[i].substring(j,j+1))){
//                    arrStr1[i] = arrStr1[i].replaceAll(arrStr2[i].substring(j,j+1),"");
//                }
//            }
//
//            for (int j = 0; j < arrStr1[i].length(); j++){
//                arrStr1[i] = arrStr1[i].toUpperCase();
//                if (!stringBuilder.toString().contains(arrStr1[i].substring(j,j+1)))
//                {
//                    stringBuilder.append(arrStr1[i].substring(j,j+1));
//                }
//
//            }
//        }
//
//        System.out.print(stringBuilder);
//
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String originalString = in.next();
        String referenceString = in.next();
        ArrayList<Character> outString = new ArrayList<Character>();

        int size = originalString.length();
        int ioriginal = 0;
        int iReference = 0;
        while (ioriginal < size){
            boolean equal = false;//默认源字符和参照字符不相等
            char originalChar = originalString.charAt(ioriginal);//取得下标字符
            char originalUpper = Character.toUpperCase(originalChar);//转换为大写
            if (iReference >= referenceString.length()){
                //参照字符遍历结束
                equal = true;
            }else {
                char referenceChar = referenceString.charAt(iReference);
                char referenceUpper = Character.toUpperCase(referenceChar);
                if (referenceUpper != originalUpper)
                    equal = true;
            }

            if (equal){
                if (!outString.contains(originalUpper)){
                    outString.add(originalUpper);
                }
                ioriginal++;
            }else {
                ioriginal++;
                iReference++;
            }
        }

        for (int i = 0; i < outString.size(); i++){
            System.out.print(outString.get(i));
        }

        System.out.println();
    }
}

