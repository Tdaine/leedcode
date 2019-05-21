package Twice_day01;

import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        return quickSort(a,0,n - 1,K);
    }

    public int quickSort(int[] a,int low,int high,int k){
            int index = getIndex(a,low,high);
//            if (k == index - low + 1)
//                return a[index];
//            else if (k < index - low + 1)
//                return quickSort(a,low,index - 1,k);
//            else
//                return quickSort(a,index + 1,high,k - index + low - 1);
        if (k == index + 1)
            return a[index];
        else if (k < index + 1)
            return quickSort(a,low,index - 1,k);
        else
            return quickSort(a,index + 1,high,k);
    }

    private int getIndex(int[] a,int low,int high){
        int temp = a[low];
        while (low < high){

            while (low < high && a[high] <= temp)
                high--;
            a[low] = a[high];
            while (low < high && a[low] >= temp)
                low++;
            a[high] = a[low];
        }
        a[high] = temp;
        return high;
    }
}