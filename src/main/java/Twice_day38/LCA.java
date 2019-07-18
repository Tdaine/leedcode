package Twice_day38;

/**
 * @author abaka
 * @date 2019/7/18 14:56
 */
public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        if (a > b){
            if (a / 2 == b)
                return b;
            else
                return getLCA(a / 2,b);
        }else {
            if (a == b/2)
                return a;
            else return getLCA(a,b/2);
        }

//        if (a == b)
//            return a;
//        if (a > b)
//            return getLCA(a / 2,b);
//        else return getLCA(a,b/2);
    }
}