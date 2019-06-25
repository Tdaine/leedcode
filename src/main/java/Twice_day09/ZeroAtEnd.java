package Twice_day09;

import java.util.Scanner;

public class ZeroAtEnd {
    /**
     * 解决思路是，因为尾数为0的数都是一个偶数和5的乘积，所以如果想知道这个数阶乘的尾数有多少个0
     * 可以将这个数进行拆分，求每个数分别包含多少个5，这样成在一起就有多少个0（比如说5，就是分别求5 4 3 2 1），
     * 在求解的过程中会有隐含的5，比如151可以拆分成(150 149 ... 2 1)而其中的150有多少个5呢？
     * 150%5==0，那是一个5吗？不是，因为150*偶数可以有两个0，这是因为里面有隐含的5，150/5=30，30%5==0，30/5==6；
     * 所以在求解的过程中需要找出所有的隐含5，也就是循环除5，直到不是5的倍数，这个数字才算找到了所有的5.之后再加上其他分支中5的个数就是结果了。
     * 当然也可以用求包含的偶数个数，但是因为偶数个数太多了所以就求5的个数
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = n; i >= 5; i--){
            int temp = i;
             while (temp % 5 == 0){
                temp = temp / 5;
                count++;
            }
        }
        System.out.println(count);
    }
}
