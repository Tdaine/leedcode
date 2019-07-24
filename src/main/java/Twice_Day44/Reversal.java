package Twice_Day44;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/24 18:21
 */
public class Reversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            //使用正则表达式作为分隔符
            String[] arr = str.split("[^a-zA-Z]+");
            for (int i = arr.length - 1; i > 0; i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[0]);
        }
        in.close();
    }
}
