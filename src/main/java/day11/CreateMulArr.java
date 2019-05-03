package day11;

public class CreateMulArr {
    /**
     * 思路：求出i的左边积left[i]和右边积right[i]，最后B[i] = left[i] * right[i];
     * @param A
     * @return
     */
    public static int[] multiply(int[] A){
        if (A == null)
            return null;
        int[] B = new int[A.length];
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        left[0] = right[A.length - 1] = 1;
        for (int i = 1; i < A.length; i++){
            left[i] = A[i - 1] * left[i - 1];
        }
        for (int i = A.length - 2; i >= 0; i--){
            right[i] = A[i + 1] * right[i + 1];
        }
        for (int i = 0; i < A.length; i++){
            B[i] = left[i] * right[i];
        }
        return B;
    }
}
