package Twice_day04;

import java.util.Scanner;

public class BuyApple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = 0;
        for (int i = 0; i <= n / 8; i++){
            int surplus = n - (i * 8);
            int j = surplus / 6;
            if (surplus % 6 == 0){
                min = i + j;
            }
        }
        if (min != 0)
            System.out.println(min);
        else
            System.out.println(-1);
    }

    /**
     * optimize solution
     * 对数字特征进行分析。 首先，6和8都是偶数。因此，能凑出的个数也一定是偶数。程序中若苹果总数是奇
     * 数，可以直接返回-1。 再次，偶数个苹果数对8取模，其结果只可能为0,2,4,6。若余数为6或者0，则可以直
     * 接用6包装情况处理，不需要回溯购买8包装的情况。若余数为4，只需回溯1次即可，因为8+4=12, 12%6 =
     * 0。若余数为2，只需回溯2次即可，因为8+8+2=18, 18%6 = 0。 综上，可以采用如下思路进行处理。（由于
     * 数字6和8的特征，本方法只适用于本题） 情况1：若num不是偶数，则直接返回-1 情况2：若num%8 = 0，
     * 则返回num/8 情况3：若num%8 != 0，则只需回溯1次或者2次8包装购买个数，就可以求解。回溯1次，其
     * 结果为n/8-1+2 = n/8+1；回溯1次，其结果为n/8-2+3 = n/8+1。因此，可以情况3下，可以返回n/8+1。
     * @param n
     * @return
     */
    public static int solution(int n){
        //是偶是，最小是6，10以上偶数
        if (n % 2 != 0 || n == 10 || n < 6)
            return -1;
        //如果拿8个刚好拿完
        if (n % 8 == 0)
            return n / 8;
        //10以上的偶数，如果对8取余不为0，就要从前面拿出1或者2个8，把余数补成6的倍数
        return 1 + n / 8;
    }
}
