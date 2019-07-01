package Twice_day25;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/1 20:23
 */
public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] credit = new int[n];
        for (int i = 0; i < n; i++){
            credit[i] = in.nextInt();
        }

        double[] grade = new double[n];
        for (int i = 0; i < n; i++){
            int score = in.nextInt();
            if (score <= 100 && score >= 90){
                grade[i] = 4.0;
                continue;
            }else if (score <= 89 && score >= 85){
                grade[i] = 3.7;
                continue;
            }else if (score <= 84 && score >= 82){
                grade[i] = 3.3;
                continue;
            }else if (score <= 81 && score >= 78){
                grade[i] = 3.0;
                continue;
            }else if (score <= 77 && score >= 75){
                grade[i] = 2.7;
                continue;
            }else if (score <= 74 && score >= 72){
                grade[i] = 2.3;
                continue;
            }else if (score <= 71 && score >= 68){
                grade[i] = 2.0;
                continue;
            }else if (score <= 67 && score >= 64){
                grade[i] = 1.5;
                continue;
            }else if (score <= 63 && score >= 60){
                grade[i] = 1.0;
                continue;
            }else
                grade[i] = 0.1;
        }

        double GPA = 0;
        int countcredit = 0;
        for (int i = 0; i < n; i++){
            GPA += (credit[i] * grade[i]);
            countcredit += credit[i];
        }

        double c = 0.1;
        int j = countcredit;
        while (countcredit /10 != 0){
            c *= 0.1;
            countcredit = countcredit / 10;
        }

        countcredit = j;
        System.out.println("GPA:" + GPA + " " + "countcredit:" + countcredit + " " + "c:" + c);

        double ret = (GPA / countcredit) + ((GPA % countcredit) * c);
        System.out.println(ret);

        String aveCPA = new DecimalFormat("0.00").format(ret);

        System.out.println(aveCPA);
    }
}
