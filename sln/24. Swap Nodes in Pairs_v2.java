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
			
            // swap
            prev.next = next;
            next.next = cur;
            cur.next = nextNext;
			
            prev = cur;
            cur = nextNext;
			// example: dummy-> 1(node1) -> 2(node2) -> 3
            //          dummy-> 2(node2) -> 1(node1) -> 3
        }
        
        return dummy.next;
    }
}