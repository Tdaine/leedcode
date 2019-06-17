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
    /**
     * 这个方法是使用直接使用链表中存储的数字进行相加，然后将个位存储，进位保存，加到下一组数字中
     * @param a
     * @param b
     * @return
     */
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


    /**
     * 此方法使用的是将链表中的数字使用字符串进行拼接后转换为整数，然后求和
     * 再将求和结果int类型，转换为字符串使用toCharArray()将各位上的数字存储到数组中
     * 然后按照从低位到高位存储到链表中
     * @param a
     * @param b
     * @return
     */
    public ListNode plusAB2(ListNode a, ListNode b){
        //将链表转换为整数
        int aValue = listNodeConvertIntValue(a);
        int bValue = listNodeConvertIntValue(b);

        int sumValue = aValue + bValue;

        return intValueConvertListNode(sumValue);
    }

    private int listNodeConvertIntValue(ListNode node){
        StringBuilder sb = new StringBuilder();
        ListNode curr = node;
        while (curr != null){
            sb.append(node.val);
            curr = curr.next;
        }
        return Integer.parseInt(sb.toString());
    }

    private ListNode intValueConvertListNode(int value){
        char[] charArray = String.valueOf(value).toCharArray();
        ListNode node = new ListNode(Integer.parseInt(String.valueOf(charArray[charArray.length - 1])));
        ListNode cur = node;
        for (int i = charArray.length - 2; i >= 0; i--){
            cur.next = new ListNode(Integer.parseInt(String.valueOf(charArray[i])));
            cur = cur.next;
        }
        return node;
    }
}