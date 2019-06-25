package Twice_day08;

import java.util.Scanner;

public class MinK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] sarr = in.nextLine().split(" ");
        int[] arr = new int[sarr.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.valueOf(sarr[i]);
        }
        int n = arr[arr.length - 1];
        qulickSort(arr,0,arr.length - 2,n);
        for (int i = 0; i < n; i++){
            if (i == n - 1){
                System.out.print(arr[i]);
                continue;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 使用快排的思想，只需要排序最小K个所在的部分就可以了
     * @param arr
     * @param start
     * @param end
     * @param k
     */
    private static void qulickSort(int[] arr,int start,int end,int k){
        if (start >= end)
            return;
        int index = findIndex(arr,start,end);
        if (index >= k - 1)
            qulickSort(arr,start,index - 1,k);
        else {
            qulickSort(arr,start,index - 1,k);
            qulickSort(arr,index + 1,end, k);
        }
    }

    private static int findIndex (int[] arr,int start,int end){
       int low = start;
       int hight = end;
       int flag = arr[low];
       while (low < hight){
           while (low < hight && arr[hight] >= flag){
               hight--;
           }
           arr[low] = arr[hight];
           while (low < hight && arr[low] <= flag){
               low++;
           }
           arr[hight] = arr[low];
       }
       arr[low] = flag;
       return low;
    }

}
