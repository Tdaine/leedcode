package Twice_day39;

/**
 * @author abaka
 * @date 2019/7/19 14:30
 */
public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        StringBuilder sb = new StringBuilder();
        int[] ret = new int[n * n];
        int index = 0;
        sb.append("[");
        // write code here
        for(int i = n - 1; i >= 0; i--){
            int z = 0;
            for (int j = i; j < n; j++){
                ret[index++] = arr[z][j];
                z++;
            }
        }
        for (int i = 1; i < n; i++){
            int j = 0;
            for (int z = i; z < n; z++){
                ret[index++] = arr[z][j];
                j++;
            }
        }
        return ret;
    }
}