package Twice_day46;

/**
 * @author abaka
 * @date 2019/7/27 18:35
 */
public class MoreThanHalfNum {
    class Solution {
        public int MoreThanHalfNum_Solution(int [] array) {
            if (array.length <= 0)
                return 0;
            int flag = 0;
            int count = 0;
            for(int i = 0; i < array.length; i++){
                if(count == 0){
                    flag = array[i];
                    count = 1;
                    continue;
                }
                if(array[i] == flag){
                    count++;
                }else{
                    count--;
                }
            }
            count = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] == flag)
                    count++;
            }
            if(count > array.length / 2)
                return flag;
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5,4,2,2};
        int n = new MoreThanHalfNum().new Solution().MoreThanHalfNum_Solution(arr);
        System.out.println(n);
    }
}
