package Twice_day22;

import java.util.Scanner;

public class Bead {
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
}

