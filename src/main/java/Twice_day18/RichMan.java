package Twice_day18;

public class RichMan {
    public static void main(String[] args) {
        int richer = 0;
        int stranger = 0;
        for (int i = 0; i < 30; i++){
            richer += 10;
            stranger += Math.pow(2,i);
        }
        System.out.println(richer + " " + stranger);
    }
}
