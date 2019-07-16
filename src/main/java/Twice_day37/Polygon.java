package Twice_day37;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/16 17:45
 */
public class Polygon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] op = new int[n][2];
        for (int i = 0; i < n; i++){
            op[i][0] = in.nextInt();
            op[i][1] = in.nextInt();
        }
        stickPuzzle(n,op);
    }

    private static void stickPuzzle(int n,int[][] op){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (op[i][0] == 1){
                list.add(op[i][1]);
            }else {
                list.remove(new Integer(op[i][1]));
            }

            if (canFormPoly(list)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    //验证是否是多边形：n-1条边和大于另一条边
    public static boolean canFormPoly(ArrayList<Integer> list){
        int len = list.size();
        for (int i = 0; i < len; i++){
            int temp = list.remove(i);
            int sum = 0;
            for (int j = 0; j < list.size(); j++){
                sum += list.get(j);
            }
            if (sum <= temp){
                list.add(i,temp);
                return false;
            }
            list.add(i,temp);
        }
        return true;
    }
}
