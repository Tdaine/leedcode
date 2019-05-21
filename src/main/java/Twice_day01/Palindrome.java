package Twice_day01;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.next();
            String s2 = in.next();
            if (s1.length() >= 100 || s2.length() >= 100)
                return;
            int count = 0;
            for (int i = 0; i <= s1.length(); i++){
                int flag = 1;
//                StringBuilder s3 = new StringBuilder();
//                s3.append(s1.substring(0,i));
//                s3.append(s2);
//                s3.append(s1.substring(i));
                //这里可以使用SyringBuilder的insert方法
                StringBuilder s3 = new StringBuilder(s1);
                s3.insert(i,s2);
                char[] arr = s3.toString().toCharArray();
                for (int j = 0; j < s3.length()/2; j++){
                    if (arr[j] != arr[s3.length() - 1 - j])
                    {
                        flag = -1;
                        break;
                    }
                }
                if (flag == 1)
                    count++;
            }
            System.out.println(count);
        }
    }
}
