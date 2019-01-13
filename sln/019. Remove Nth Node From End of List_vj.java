/*19. Remove Nth Node From End of List
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode q = dummyHead;
        
        for (int i = 0; i < n+1; i ++) {
            p = p.next;
        }
        
        while (p != null) {// (length - n) loops equal Nth from end
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        
        return dummyHead.next;
    }
}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        
        // let fast move to the nth node
        for (int i = 0; i < n; i++) {
            fast = fast.next;   // n is always valid
        }
        
        while (fast.next != null) {// {1} 1 promise slow.next.next is valid
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return dummyHead.next;
    }
}