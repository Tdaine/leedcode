package Twice_day12;

public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        String[] str = new String[(int) Math.pow(2,n - 1)];
        if (n < 1)
            return str;
        if (n == 1){
            str[0] = "0";
            str[1] = "1";
            return str;
        }
        str = getGray(n - 1);
        String[] str2 = new String[2*str.length];
        /**
         * 使用递归的思路：
         * 递归的思路是n为gray码是由n-1位gray码加1和0构成的；
         * 比如：n = 3;
         * n = 3的gray码就是由n = 2的gray码(00,01,11,10)
         * 在首位加0生成(000,001,011,010)
         * 反序在首位加1生成(110,111,101,100)
         * 最后进行拼接生成n = 3gray码(000,001,011,010,110,111,101,100)
         */
        for (int i = 0; i < str.length / 2; i++){
            str2[i] = "0" + str[i];
            str2[str.length / 2 + i] = "1" + str[i];
        }
        return str2;
    }
}
