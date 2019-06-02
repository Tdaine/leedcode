package Twice_day12;

public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] + AB[1];
        AB[1] = AB[0] - AB[1];
        AB[0] = AB[0] - AB[1];
        return AB;
    }

    public int[] exchangeABTwo(int[] AB) {
        // write code here
        AB[0] ^= AB[1];
        AB[1] ^= AB[0];
        AB[0] ^= AB[1];
        return AB;
    }
}
