package Twice_day17;

import java.util.*;

public class TrainOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        //计算n个火车的排列组合
        ArrayList<int[]> result = new ArrayList<int[]>();
        order(arr,0,n,result);
        //出栈的结果，一个元素一个记录
        Set<String> sortResult = new TreeSet<String>();

        for (int[] out: result){
            if (isLegal(arr,out,n)){
                //正确序列
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n - 1; i++){
                    sb.append(out[i] + " ");
                }
                sb.append(out[n - 1]);
                sortResult.add(sb.toString());
            }
        }

        //全部输出正确序列
        for (String list:sortResult){
            System.out.println(list);
        }
        in.close();
    }

    /**
     * 判断火车出站顺序是否正确
     * @param in
     * @param out
     * @param n
     * @return
     */
    public static boolean isLegal(int in[],int out[],int n){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int i = 0;
        int j = 0;
        while (i < n){
            if (in[i] == out[j]){
                i++;
                j++;
            }else{
                if (stack.isEmpty()){
                    stack.push(in[i]);
                    i++;
                }else {
                    int top = stack.peek();//取栈顶元素，不出栈
                    if (top == out[j]){
                        j++;
                        stack.pop();
                    }else if (i < n){
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }
        while (!stack.isEmpty() && j < n){
            int top = stack.pop();
            if (top == out[j]){
                j++;
            }else
                return false;
        }
        return true;
    }

    /**
     * 计算出所有的排列组合情况
     * @param arr
     * @param start
     * @param n
     * @param result
     */
    public static void order(int arr[],int start,int n,ArrayList result){
        if (start == n)
            return;
        if (start == n - 1){
            int[] temp = arr.clone();
            result.add(temp);
            return;
        }

        //动态规划，计算出所有可能排列情况
        for (int i = start; i < n; i++){
            swap(arr,start,i);
            order(arr,start + 1,n,result);
            swap(arr,start,i);
        }

    }

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
