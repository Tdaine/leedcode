package day15;

public class UnusualAdd {
    public static void main(String[] args) {

    }

    /**
     * 使用异或和与进行计算
     * 异或：1^1 = 0; 1^0 = 1; 0^0 = 0;
     * 加_本位：1+1 = 0;1+0 = 1;0+0 = 0;
     * 与：1&1 = 1;1&0 = 0;0&0 = 0;
     * 加_进位：1+1 = 1;1+0 = 0;0+0 = 0;
     * @param A
     * @param B
     * @return
     */
    public static int addAB(int A,int B){
        if (B == 0)
            return A;
        int sum = A^B;
        int jin = (A & B) << 1;
        return addAB(sum,jin);
    }
}
