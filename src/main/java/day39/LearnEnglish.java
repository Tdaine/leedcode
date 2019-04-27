package day39;

import java.util.Scanner;

public class LearnEnglish {
    public static String[] num1 = {"zero","one","two","three","four",
    "five","six","seven","eight","nine"};

    public static String[] num2 = {"ten","eleven","twelve","thirteen",
    "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

    public static String[] num3 = {"twenty","thirty","forty","fifty",
    "sixty","seventy","eighty","ninety"};

    public static String parse(long num){
        if (num < 0)
            return "error";
        StringBuilder sb = new StringBuilder();
        long billon = num / 1000000000;//十亿部分
        if(billon != 0)
            sb.append(transfer(billon) + "billion");
        num = num % 1000000000;
        long million = num / 1000000;//百万部分
        if (million != 0)
            sb.append(transfer(million) + "million");
        num = num % 1000000;

        long thousand = num / 1000;//千部分
        if (thousand != 0)
            sb.append(transfer(thousand) + "thousand");
        num = num % 1000;

        if (num != 0)
            sb.append(transfer(num));

        return sb.toString().trim();//去掉字符串最后面的空格
    }

    public static String transfer(long num){
        StringBuilder sb = new StringBuilder();
        long h = num / 100;//百位处理
        if (h != 0){
            sb.append(num1[(int)h] + "hundred");
        }
        num %= 100;

        long k = num / 10;//十位处理
        if (k != 0){
            if (h != 0)
                sb.append("and");
            if (k == 1)
                sb.append(num2[(int)(num % 10)]);
            else {
                sb.append(num3[(int)(k - 2)] + " ");
                if (num % 10 != 0)
                    sb.append(num1[(int)(num % 10)]);
            }
        }else if (num % 10 != 0){//如果没有十位的部分，则直接翻译个位
            if (h != 0)
                sb.append("and");
            sb.append(num1[(int)(num % 10)]);
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long num = in.nextLong();
            System.out.println(parse(num));
        }
        in.close();
    }
}
