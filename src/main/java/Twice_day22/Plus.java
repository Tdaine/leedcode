package Twice_day22;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode head = new ListNode(-1);
        ListNode p = head;
        ListNode pa = a;
        ListNode pb = b;
        int c = 0,sum,val1,val2;
        while (pa != null || pb != null || c != 0){
            val1 = (pa == null) ? 0 : pa.val;
            val2 = (pb == null) ? 0 : pb.val;

            sum = val1 + val2 + c;
            c = sum / 10;
            sum = sum % 10;

            p.next = new ListNode(sum);
            p = p.next;

            pa = (pa == null) ? null : pa.next;
            pb = (pb == null) ? null : pb.next;
        }
        return head.next;
    }
}