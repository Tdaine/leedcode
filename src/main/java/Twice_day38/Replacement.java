package Twice_day38;

/**
 * @author abaka
 * @date 2019/7/18 15:18
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++){
             if (iniString.charAt(i) == ' ')
               stringBuilder.append("%20");
             else stringBuilder.append(iniString.charAt(i));
         }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "hello  world";
        System.out.println(new Replacement().replaceSpace(str,12));
    }
}