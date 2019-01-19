/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        // set fast at the k-th node
        for (int i = 0; i < k; i++) {
            if (fast.next != null)
                fast = fast.next;
            else 
                return null;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;
    }
}