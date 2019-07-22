package Twice_day42;

import java.util.Date;
import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/22 11:49
 */
public class day {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            int days = 0;
//        Date date1  = new Date(year,month - 1,day + 1);
            for (int i = 1; i < month; i++){
                switch (i){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days += 31;
                        break;
                    case 2:
                        days += isRun(year) ? 29 :28;
                        break;
                    default:
                        days += 30;
                }
            }
            days += day;

            System.out.println(days);
        }
    }

    public static boolean isRun(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        return false;
    }
}
