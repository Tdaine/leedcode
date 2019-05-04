package day15;

import java.util.Scanner;

public class CommonStrCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        System.out.println(commonStringCalculation(str1,str2));
    }

    public static int commonStringCalculation(String str1,String str2){
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++){
            for(int j = 0; j <= str2.length(); j++){
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= str1.length(); i++){
            for(int j = 1; j <= str2.length(); j++){
                if (str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else dp[i][j] = 0;
            }
        }

        int max = 0;
        for (int i = 0; i < str1.length(); i++){
            for (int j = 0; j < str2.length(); j++){
                if (dp[i][j] > max)
                    max = dp[i][j];
            }
        }
        return max;
    }
}
