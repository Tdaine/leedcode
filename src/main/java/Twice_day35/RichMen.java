package Twice_day35;

/**
 * @author abaka
 * @date 2019/7/14 16:48
 */
public class RichMen {
    public static void main(String[] args) {
        long stranger = 0;
        int rich = 0;
        for (int i = 0; i < 30; i++){
            stranger += Math.pow(2,i);
            rich += 10;
        }
        System.out.println(rich + " " +stranger);
    }
}
