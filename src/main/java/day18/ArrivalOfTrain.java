package day18;

import java.util.*;

public class ArrivalOfTrain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++){
                A[i] = in.nextInt();
            }
            int start = 0;
            //result保存所有可能存在的序列
            ArrayList<int[]> result = new ArrayList<int[]>();
            permutation(A,start,n,result);

            //保存最终符合的序列结果
            Set<String> sortResult = new TreeSet<String>();

            for (int[] out:result){
                if (isLegal(A,out,n)){
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < n -1; i++){
                        sb.append(out[i] + " ");
                    }
                    sb.append(out[n - 1]);
                    sortResult.add(sb.toString());
                }
            }
            for (String s:sortResult){
                System.out.println(s);
            }
        }
        in.close();
    }

    /**
     * 判断序列是否符合先进后出的规则
     * @param in
     * @param out
     * @param n
     * @return
     */
    public static boolean isLegal(int[] in,int[] out,int n){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int i = 0;
        int j = 0;
        while (i < n){
            if (in[i] == out[j]){
                i++;
                j++;
            }else {
                if (stack.isEmpty()){
                    stack.push(in[i]);
                    i++;
                }else {
                    int top = stack.peek();
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
            }else {
                return false;
            }
        }
        return true;
    }

    /**
     * 计算出所有可能序列
     * @param A
     * @param start
     * @param n
     * @param result
     */
    private static void permutation(int[] A,int start,int n,ArrayList<int[]> result){
        if (start == n)
            return;
        if (start == n - 1){
            int[] B = A.clone();
            result.add(B);
            return;
        }
        for (int i = start; i < n;i++){
            swap(A,start,i);
            permutation(A,start + 1,n,result);
            swap(A,start,i);
        }
    }

    private static void swap(int[] A,int i,int j){
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
}
