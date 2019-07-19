package Twice_day39;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/19 14:47
 */
public class HuiWEnString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            int i = 0;
            for (i = 0; i < str.length() / 2; i++){
                if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                    break;
            }
            if (judge(i,str.length() - 2 - i,str) || judge(i + 1,str.length() - 1 - i,str))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean judge(int start,int end,String str){
        while (start < end){
            if (str.charAt(start) != str.charAt(end))
                return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }
}
