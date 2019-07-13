package Twice_day34;

import java.util.Scanner;

/**
 * @author abaka
 * @date 2019/7/13 10:41
 */
public class Globe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int x0 = in.nextInt();
            int y0 = in.nextInt();
            int z0 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int z1 = in.nextInt();
            double r = Math.sqrt(Math.pow((x1 - x0), 2)
                    + Math.pow((y1 - y0), 2)
                    + Math.pow((z1 - z0), 2));
            double volume = 4 * Math.PI * Math.pow(r, 3) / 3;
            System.out.printf("%.3f %.3f\n",r,volume);
        }
    }
}
