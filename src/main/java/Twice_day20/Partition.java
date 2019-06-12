package Twice_day20;

import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode min = new ListNode(-1);
        ListNode max = new ListNode(-1);
        ListNode minP = min;
        ListNode maxP = max;
        while (pHead != null){
            if (pHead.val < x){
                minP.next = new ListNode(pHead.val);
                minP = minP.next;
                pHead = pHead.next;
            }else {
                maxP.next = new ListNode(pHead.val);
                maxP = maxP.next;
                pHead = pHead.next;
            }
        }

        minP.next = max.next;
        return min.next;
    }
}