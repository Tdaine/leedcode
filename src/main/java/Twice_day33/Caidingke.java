package Twice_day33;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author abaka
 * @date 2019/7/12 10:47
 */
//public class Caidingke {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] win = new int[2];
//        int[] equal = new int[2];
//        int[] lose = new int[2];
//        int[][] max = new int[2][3];
//        for (int i = 0;i < n; i++){
//            char[] temp = new char[2];
//            temp[0] = in.next().charAt(0);
//            temp[1] = in.next().charAt(0);
//            int flage = judge(temp[0],temp[1]);
//            if (flage == 0){
//                equal[0]++;
//                equal[1]++;
//            }else if (flage == 1){
//                win[0]++;
//                lose[1]++;
//                if (temp[0] == 'C')
//                    max[0][0]++;
//                else if (temp[0] == 'J')
//                    max[0][1]++;
//                else max[0][2]++;
//            }else {
//                win[1]++;
//                lose[0]++;
//                if (temp[1] == 'C')
//                    max[1][0]++;
//                else if (temp[1] == 'J')
//                    max[1][1]++;
//                else max[1][2]++;
//            }
//
//        }
//
//        System.out.println(win[0] + " " + equal[0] + " " + lose[0]);
//        System.out.println(win[1] + " " + equal[1] + " " + lose[1]);
//        int max1 = 0;
//        int max2 = 0;
//        char index1 = 'Z';
//        char index2 = 'Z';
//        for (int i = 2; i >= 0; i--){
//            if (max[0][i] >= max1){
//                max1 = max[0][i];
//                char x = index1;
//                if (i == 0)
//                    index1 = 'C';
//                if (i == 1)
//                    index1 = 'J';
//                else
//                    index1 = 'B';
//                if (x < index1)
//                    index1 = x;
//            }
//
//            if (max[1][i] >= max2){
//                max2 = max[1][i];
//                char x = index2;
//                if (i == 0)
//                    index2 = 'C';
//                if (i == 1)
//                    index2 = 'J';
//                else
//                    index2 = 'B';
//                if (x < index2)
//                    index2 = x;
//            }
//
//        }
//        System.out.println(index1 + " " + index2);
//
//    }
//
//    private static int judge(char a,char b){
//        if (a == b)
//            return 0;
//        if ((a == 'C' && b != 'B') || (a == 'J' && b == 'B') || (a == 'B' && b == 'C'))
//            return 1;
//        else
//            return -1;
//    }
//}
///*
//10
//C J
//J B
//C B
//B B
//B C
//C C
//C B
//J B
//B C
//J J
//
// */

public class Caidingke{
    private static class Record{
        public int win;
        public int tie;
        public int lose;
        TreeMap<String,Integer> winCount;

        Record(){
            this.win = 0;
            this.tie = 0;
            this.lose = 0;
            this.winCount = new TreeMap<String, Integer>();
            this.winCount.put("B",0);
            this.winCount.put("C",0);
            this.winCount.put("J",0);
        }
    }

    private static void win(Record[] records,int win,String gesture){
        int lose = 1 - win;
        records[win].win++;
        records[lose].lose++;
        int winCount = records[win].winCount.get(gesture);
        records[win].winCount.put(gesture,winCount + 1);
    }

    private static void judge(String a,String b,Record[] records){
        if (a.equals("B")){
            if (b.equals("B")){
                records[0].tie++;
                records[1].tie++;
            }else if (b.equals("C")){
                win(records,0,"B");
            }else {
                win(records,1,"J");
            }
        }else if (a.equals("C")){
            if (b.equals("B")){
                win(records,1,"B");
            }else if (b.equals("C")){
                records[0].tie++;
                records[1].tie++;
            }else {
                win(records,0,"C");
            }
        }else {
            if (b.equals("B")){
                win(records,0,"J");
            }else if (b.equals("C")){
                win(records,1,"C");
            }else {
                records[0].tie++;
                records[1].tie++;
            }
        }
    }

    private static String mostWinGesture(TreeMap<String,Integer> winCount){
        if (winCount.get("C") >= winCount.get("J")){
            if (winCount.get("B") >= winCount.get("C"))
                return "B";
            else return "C";
        }else {
            if (winCount.get("B") >= winCount.get("J")){
                return "B";
            }else return "J";
        }
    }

    public static void main(String[] args) {
        Record[] records = new Record[2];
        records[0] = new Record();
        records[1] = new Record();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            String a = scanner.next();
            String b = scanner.next();
            judge(a,b,records);
        }

        System.out.format("%d %d %d\n",records[0].win,records[0].tie,records[0].lose);
        System.out.format("%d %d %d\n",records[1].win,records[1].tie,records[1].lose);
        System.out.format(mostWinGesture(records[0].winCount) + " " + mostWinGesture(records[1].winCount));
    }
}