package day39;

public class Printer {
    public static int[] arrayPrint(int[][] arr,int n){
        //创建数组，行数和列数分别条件判断
        int[] result = new int[n * n];
        int row = 0,col = n - 1, index = 0;
        while (row < n){
            while (row < n && col < n){
                result[index++] = arr[row][col];
                row++;
                col++;
            }
            if (row < col){
                col -= row + 1;
                row = 0;
            }else {
                row -= col - 1;
                col = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] ret = arrayPrint(arr,4);
        for (int i : ret){
            System.out.print(i + ",");
        }
    }
}
