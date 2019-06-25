package Twice_day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if (n >= 1000)
                n = 999;
            int[] arr = new int[n];
            int flag = 0;
            int count = 0;
            for (int i = 0; ; i++){
                if (i == n)
                    i = 0;
                if (arr[i] != -1){
                    flag++;
                }
                if (flag == 3){
                    arr[i] = -1;
                    flag = 0;
                    if (count == n -1){
                        System.out.println(i);
                        break;
                    }else count++;
                }
            }
        }
    }

    /**方法2：
     * 使用ArrayList集合人的位置，因为报数为3就退出也就是每隔两个就会退出
     * 设当前坐标为i,则i+ 2就是下一个要退出人的坐标，又因为是环形退出，所以需要将坐标进行循环
     * 这里就需要(i + 2) % list.size()这样求出的坐标就是在list.size()中循环，
     * 直到list.size() == 1 也就是只剩下一个人的时候退出循环，
     */
    public static void solution2( ) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();

            if (n > 1000){
                n = 999;
            }

            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++){
                list.add(i);
            }

            int i = 0;
            while (list.size() > 1){
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
