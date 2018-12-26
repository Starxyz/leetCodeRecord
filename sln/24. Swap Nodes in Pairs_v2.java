/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = dummy;
        
        while (cur != null && cur.next != null) {
            ListNode next = cur.next;
            ListNode nextNext = cur.next.next;
            
            prev.next = next;
            next.next = cur;
            cur.next = nextNext;
            prev = cur;
            cur = nextNext;
        }
        
        return dummy.next;
    }
}