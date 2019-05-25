package Twice_day04;

import java.util.Scanner;

public class DeleteStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        for (int i = 0; i < str2.length(); i++){
            if (str1.contains(String.valueOf(str2.charAt(i)))){
                str1 = str1.replaceAll(String.valueOf(str2.charAt(i)),"");
            }
        }
        System.out.println(str1);
    }
}
