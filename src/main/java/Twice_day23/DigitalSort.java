package Twice_day23;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DigitalSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //能被5整除的数字中所有偶数的和
        int A1 = 0;
        //将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4
        int A2 = 0;
        int find2 = 0;
        //被5除后余2的数字的个数
        int A3 = 0;
        //被5除后余3的数字的平均数，精确到小数点后1位
        int A4 = 0;
        int count = 0;
        //被5除后余4的数字中最大的数字
        int A5 = 0;
        int falge = 1;
        for (int i = 0; i < n; i++){
            int num = input.nextInt();
            switch (num % 5){
                case 0:
                    if (num % 2 == 0)
                        A1 += num;
                    break;
                case 1:
                    find2 = 1;
                    A2 += (falge * num);
                    falge = falge * -1;
                    break;
                case 2:
                    A3++;
                    break;
                case 3:
                    A4 += num;
                    count++;
                    break;
                case 4:
                    if (num > A5)
                        A5 = num;
                    break;
                    default:
                        break;
            }
        }
        String a4 = "N";
        if (count > 0){
            //new DecimalFormat("0.0")//0.0表示格式和0表示数字不满足格式个数补0
            //eg:如果是0.00 但是结果是3.1  那最后结果就是3.10
            a4 = new DecimalFormat("0.0").format(A4*1.0 / count);
        }

        if (A1 == 0){
            System.out.print("N" + " ");
        }else {
            System.out.print(A1 + " ");
        }
        if (find2 == 1){
            System.out.print(A2 + " ");
        }else
            System.out.print("N" + " ");

        if (A3 == 0){
            System.out.print("N" + " ");
        }else {
            System.out.print(A3 + " ");
        }
        System.out.print(a4 + " ");
        if (A5 == 0){
            System.out.print("N");
        }else {
            System.out.print(A5);
        }
    }
}
