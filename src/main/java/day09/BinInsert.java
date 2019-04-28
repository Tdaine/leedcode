package day09;

public class BinInsert {
    public static void main(String[] args) {

    }

    public static int binInsert(int n,int m,int j, int i){
        if (i < j)
            return 0;
        return n | (m << j);
    }
}
