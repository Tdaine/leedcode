package Twice_day21;

import java.util.Scanner;

public class NowCoder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String passward = in.nextLine();
            StringBuilder source = new StringBuilder();
            for (int i = 0; i < passward.length(); i++){
                if (passward.charAt(i) != ' '){
                    int c = passward.charAt(i) - 'A' - 5;
                    if (c < 0){
                        c = 26 + c;
                    }
                    source.append((char)(c + 'A'));
                }else source.append(' ');
            }

            System.out.println(source);
        }
    }
}
