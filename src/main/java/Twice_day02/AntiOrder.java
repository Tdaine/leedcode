package Twice_day02;

import java.util.*;

public class AntiOrder {
//    public int count(int[] A, int n) {
//        // write code here
//        int count = 0;
//        for (int i = 0; i < n - 1; i++){
//            for (int j = 0; j < n - i -1; j++){
//                if (A[j] > A[j + 1]){
//                    int temp = A[j];
//                    A[j] = A[j + 1];
//                    A[j + 1] = temp;
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    /**
     * optimization method
     * 使用归并排序的思路先统计小分组中的逆序对数目再合并统计总的逆序对数目，这样降低了时间复杂度
     * @param A
     * @param n
     * @return
     */
    public int count(int[] A, int n){
        if (A == null || n == 0){
            return 0;
        }
        return mergeSortRecursion(A,0,n - 1);
    }

    private int mergeSortRecursion(int[] arr,int start,int end){
        if (start >= end)
            return 0;
        int mid = (end + start) / 2;
        return mergeSortRecursion(arr,start,mid) + mergeSortRecursion(arr,mid + 1,end) + merge(arr , start,mid,end);
    }

    private int merge(int[] arr,int start,int mid,int end){
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int index = 0;
        int count = 0;
        while (i <= mid && j <= end){
            if (arr[i] <= arr[j]){
                temp[index++] = arr[i++];
            }else {
                count++;
                temp[index++] = arr[j++];
            }
        }

        while (i <= mid){
            temp[index++] = temp[i++];
        }

        while (j <= end){
            temp[index++] = temp[j++];
        }

        for (int k = 0; k < temp.length;k++){
            arr[start++] = temp[k];
        }
        return count;
    }
}

