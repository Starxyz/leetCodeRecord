/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        int len = 0;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }
        ListNode endNode = cur;

        cur = dummy;        
        for (int i = len - k%len; i > 0; i--) 
            cur = cur.next;
        // exameple: 1->2-3(cur)->4->5(end)->null
        endNode.next = dummy.next;// 5->1
        dummy.next = cur.next;// dummy->4
        cur.next = null;
        
        return dummy.next;
    }
}

/* the cases make me fail
[]
0

[1]
0
*/
