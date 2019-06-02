package day12;

public class GrayCode {
    /**
     * 使用递归的思路：
     * 递归的思路是n为gray码是由n-1位gray码加1和0构成的；
     * 比如：n = 3;
     * n = 3的gray码就是由n = 2的gray码(00,01,11,10)
     * 在首位加0生成(000,001,011,010)
     * 反序在首位加1生成(110,111,101,100)
     * 最后进行拼接生成n = 3gray码(000,001,011,010,110,111,101,100)
     * @param n
     * @return
     */
    public static String[] getGray(int n){
        String[] ret = null;
        if (n == 1){
            ret = new String[]{"0","1"};
        }else {
            String[] str = getGray(n - 1);
            ret = new String[2*str.length];
            for (int i = 0; i < str.length; i++){
                ret[i] = "0" + str[i];
                ret[ret.length -1 - i] = "1" + str[i];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String[] str = getGray(2);
        for (int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
    }
}
