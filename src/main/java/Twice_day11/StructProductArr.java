package Twice_day11;
import java.util.ArrayList;
import java.util.List;


class KeyValue{
    public int key;
    public int value;

    public KeyValue(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class Solution {
    public int[] multiply(int[] A) {
        List<KeyValue> list = new ArrayList<KeyValue>();
        for (int i = 0; i < A.length;i++){
            list.add(new KeyValue(i,1));
        }
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length;j++){
                if (i != j){
                    list.add(new KeyValue(j,list.get(j).value + 1));
                }
            }
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            ret[i] = list.get(i).value;
            System.out.print(ret[i] + " ");
        }
        return ret;
    }
}

public class StructProductArr {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1,2,3,4,5};
        solution.multiply(arr);
    }
}
