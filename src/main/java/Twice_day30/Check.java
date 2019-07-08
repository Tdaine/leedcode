package Twice_day30;


import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/8 13:21
 */
public class Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            jiJiaoYan(str.toCharArray());
        }
    }

    private static void jiJiaoYan(char[] s){
        int[] result = new int[8];
        for (int i = 0; i < s.length; i++){
          //  int n = 0x01;
            int j = 7;
            int sum = 0;
            int a = s[i];
            while (j > 0){
                //使用按位与进行运算
//                result[j] = (s[i] & n) == 0 ? 0 : 1;//与运算，如果是0表示测得这一位为0，否则为1
//                if (result[j] == 1)
//                    sum++;
//                n = n << 1;
//                j--;
                result[j] = a % 2;
                if (result[j] == 1)
                    sum++;
                a = a / 2;
                j--;
            }
            if (sum % 2 == 0)//如果Sum为偶数，表明需要进行校验，将第一位设置为1
                result[0] = 1;
            for (int k = 0; k < result.length; k++){
                System.out.print(result[k]);
            }
            result[0] = 0;
            System.out.println();
        }
    }
}
