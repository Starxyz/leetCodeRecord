import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode cur = pHead;
        ListNode pSmall = small;
        ListNode pBig = big;
        while (cur != null) {
            if (cur.val < x) {
                small.next = new ListNode(cur.val);
                small = small.next;
            }
            else {
                big.next = new ListNode(cur.val);
                big = big.next;
            }
            
            cur = cur.next;
        }
        if (pSmall.next == null)
            return pBig.next;
        
        if (pBig.next != null)
            small.next = pBig.next;
        
        return pSmall.next;
    }
}