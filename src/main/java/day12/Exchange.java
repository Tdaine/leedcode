package day12;

public class Exchange {
   public static int[] exchangerAB(int[] AB){
       AB[0] = AB[0] + AB[1];
       AB[1] = AB[0] - AB[1];
       AB[0] = AB[0] - AB[1];
       return AB;
   }

    public static void main(String[] args) {
        int[] AB = new int[]{1,2};
        AB = exchangerAB(AB);
        for(int i : AB){
            System.out.println(i);
        }
    }
}
