/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = head;
        ListNode pre = dummyHead;
        
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            
            if (pre.next == cur) {// cur.val is distinct
                pre = pre.next;
            } else {
                pre.next = cur.next;// skip duplicates
            }
            
            cur = cur.next;
        }
        
        return dummyHead.next;
    }
}