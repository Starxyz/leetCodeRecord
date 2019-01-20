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
        ListNode dummyHead1 = new ListNode(0);
        ListNode dummyHead2 = new ListNode(0);
        ListNode p1 = dummyHead1;
        ListNode p2 = dummyHead2;
        while (pHead != null) {
            if (pHead.val < x) {
                p1.next = pHead;
                p1 = p1.next;
            }
            else {
                p2.next = pHead;
                p2 = p2.next;
            }
            pHead = pHead.next;
        }
        p2.next = null;// prevent [x+1, x-1, x-2]
        p1.next = dummyHead2.next;
        
        return dummyHead1.next;
    }
}