/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if (slow == fast) {
                ListNode slow2 = head;
                while (slow2 != slow) { // (n-1)round means turn back to start point
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}