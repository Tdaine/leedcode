package Twice_day37;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/18 15:46
 */
public class FrogRun {
    private static int n,m,p,maxEnergy = 0;
    private static int[][] map;
    static String path = "";
    private static boolean flag = false;
    private static LinkedList<String> linkedList = new LinkedList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        p = in.nextInt();
        map = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                map[i][j] = in.nextInt();
            }
        }

        runMap(0,0,p);
        if (flag == true)
            System.out.println(path);
        else
            System.out.println("Can not escape!");
    }

    private static void runMap(int x,int y,int p){
        if (x < 0 || y < 0 || x >= n || y >= m || map[x][y] == 0 || p < 0)
            return;
        else {
            linkedList.offer("[" + x + "," + y + "]");
            map[x][y] = 0;
            if (x == 0 && y == m - 1){
                if (p >= maxEnergy){
                    maxEnergy = p;
                    updatePath();
                }
                map[x][y] = 1;
                linkedList.removeLast();
                flag = true;
                return;
            }
            runMap(x , y + 1,p - 1);
            runMap(x , y - 1,p - 1);
            runMap(x + 1, y, p);
            runMap(x - 1, y, p - 3);
            map[x][y] = 1;
            linkedList.removeLast();
        }
    }

    private static void updatePath(){
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            sb.append(iterator.next() + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        path = sb.toString();
    }
}
