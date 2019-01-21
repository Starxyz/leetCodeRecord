import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode dummyHead = new ListNode(0);
        ListNode p = a;
        ListNode q = b;
        ListNode curr = dummyHead;
        int carryBit = 0;
        
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int digit = carryBit + x + y;
            carryBit = digit / 10;
            curr.next = new ListNode(digit % 10);
            curr = curr.next;
            
            if (p != null) p = p.next;
            if (q != null) q = q.next;            
        }
        if (carryBit > 0)
            curr.next = new ListNode(carryBit);
        
        return dummyHead.next;
    }
}