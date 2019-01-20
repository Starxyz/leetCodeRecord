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
        ListNode cur = head;
        ListNode pre = head;
        
        while (cur != null) {
            if (cur.val == pre.val) {
                cur = cur.next;
            }
            else {
                pre.next = cur;
                pre = pre.next;
            }
        }
        if (pre != null)// handle [1,1,1] etc...
            pre.next = null;
        
        return head;
    }
}