package Twice_day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/10 12:58
 */
public class Ironic {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = reader.readLine();
//        String[] words = line.split(" ");
//        for (int i = 0; i < words.length; i++){
//            System.out.format("%s ",words[words.length - 1 - i]);
//        }
//        System.out.println(words[0]);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String line = in.nextLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length - 1; i++){
                System.out.print(words[words.length - 1 - i] + " ");
            }
            System.out.println(words[0]);
        }
    }
}
