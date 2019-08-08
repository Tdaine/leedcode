package Twice_day15;

class UnusualAdd {
    /**
     * 二进制加法特点
     * 位的异或运算跟求‘和’的结果一致：
     *  异或 1^1 = 0   1^0 = 1 0^0 = 0
     *  求和 1+1 = 0   1+0 = 1 0+0 = 0
     * 位的与运算跟求‘进位’的结果一致:
     *  位 与 1&1 = 1 1&0 = 0 0&0 = 0
     *  进位  1+1 = 1 1+0 = 1 0+0 = 0
     * @param A
     * @param B
     * @return
     */
    public int addAB(int A, int B) {
        // write code here
        int xor,and;
        while (B != 0){
            xor = A^B;//求和，但是不加进位
            and = (A&B) << 1;//求进位
            A = xor;
            B = and;//如果进位为0，那么当前的和(A)就是最后的结果
        }
        return A;
    }
}