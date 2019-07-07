package Twice_day29;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/7 13:24
 */
public class Award {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            float fenmu = denominator(n);
            float fenzi = misSort(n);
            float result = (fenzi / fenmu) * 100;
            System.out.println(String.format("%.2f",result) + "%");
        }
    }

    /**
     *用排列组合求解分母，也就是求出共有多少种抽奖的可能
     * 比如有5个人抽奖，第一个人有5中可能，第二个人就是4种可能，第三个人就是3种
     * 以此类推就是n个人抽奖可能性就是n!
     */
    private static float denominator(int n){
        float result = 1;
        if (n == 1)
            return 1;
        else if (n > 1)
            result = n * denominator(n - 1);
        return result;
    }


    /**
     * 使用错误排序求出分子，上面的分母求的是总共的所有可能抽奖结果，
     * 那么分子求的就是所有可能抽错误的结果。
     * 比如5个人抽奖，第一个人抽错的可能性是4种，第二个人抽错误的可能性就是两种情况：
     * 1.第一个人抽中的是第二个人的名字，那么第二个人的抽错误可能性就是100%，直接求
     * 2.第一个人抽中的不是第二个人的名字，那么第二个人的抽错误可能性就是3种
     * 盗用百度上的思路就是：
     *由题意a1=0，a2=1，当n≥3时，在错排中n必不在第n位，设n放在第k位上（1≤k≤n-1），则第n位上有两种可能：
     *
     * （1）如果第n位上不是k，那么把第n位看作第k位，将n以外的n－1个数进行错排，错排个数是an-1；
     *
     * （2）如果第n位上是k，那么除n和k以外的n－2个数的错排是an-2，
     *
     * 所以n在第k位上的错排数共有a(n-1)＋a(n-2)，由于k可取1、2、3、4、……、n－1共n－1种取法，所以n个数的错排个数a(n) = (n-1)(a(n-1) + a(n-2))，其中n≥3.
     * @param n
     * @return
     */
    private static float misSort(int n){
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return (n - 1)*(misSort(n - 1) + misSort(n - 2));
    }
}
