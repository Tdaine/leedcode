package Twice_day41;

import java.util.*;

/**
 * @author abaka
 * @date 2019/7/21 17:53
 */
public class Point {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String[] A = str.split(";");
            int x = 0, y =0;
            for (String string : A){
//                if (string.length() <= 3 && string.length() >= 2)
                if (string.length() <= 3){
                    if (string.charAt(0) == 'A' && string.substring(1).matches("[0-9]+"))
                        x -= Integer.parseInt(string.substring(1));
                    if (string.charAt(0) == 'D' && string.substring(1).matches("[0-9]+"))
                        x += Integer.parseInt(string.substring(1));
                    if (string.charAt(0) == 'W' && string.substring(1).matches("[0-9]+"))
                        y += Integer.parseInt(string.substring(1));
                    if (string.charAt(0) == 'S' && string.substring(1).matches("[0-9]+"))
                        y -= Integer.parseInt(string.substring(1));
                }
            }
            System.out.println(x + "," + y);
        }
        in.close();
    }
}
