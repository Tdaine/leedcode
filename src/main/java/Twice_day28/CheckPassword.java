package Twice_day28;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/6 16:47
 */
public class CheckPassword {
    /**
     * 解决方法就是按照题目中的条件一个一个进行验证，验证方法也是比较基础的方法
     * 这道题不要觉得太麻烦，虽然写起来很啰嗦但是很好理解
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            if (checkLength(str) && checkKinds(str) && checkRepeat(str))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
    }

    //检验长度
    private static boolean checkLength(String str){
        if (str.length() > 8)
            return true;
        else
            return false;
    }

    //检验种类
    private static boolean checkKinds(String str){
        int digit = 0,lowercase = 0,uppercase = 0,others = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= '0' && arr[i] <= '9'){
                digit = 1;
                continue;
            }else if (arr[i] >= 'a' && arr[i] <= 'z'){
                lowercase = 1;
                continue;
            }else if (arr[i] >= 'A' && arr[i] <= 'Z'){
                uppercase = 1;
                continue;
            }else {
                others = 1;
                continue;
            }
        }

        int n = digit + lowercase + uppercase + others;
        return n >= 3 ? true:false;
    }

    //检验是否重复
    private static boolean checkRepeat(String str){
        for (int i = 0; i < str.length() - 2; i++){
            String repeat = str.substring(i,i + 3);
            if (str.substring(i + 1).contains(repeat))
                return false;
        }
        return true;
    }
}
