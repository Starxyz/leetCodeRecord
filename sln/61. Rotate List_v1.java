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
        if (head == null || head.next == null || k == 0) 
            return head;
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        cur = head;
        for (int i = len - k%len; i > 1; i--) {
            cur = cur.next;
        }
        ListNode node = cur;
        ListNode node1 = cur.next;
        while (cur.next != null)
            cur = cur.next;
        cur.next = head;
        node.next = null;
        if (node1 == null) return head;// promise k == len is valid
        return node1;
    }
}


/* the cases make me fail
[1,2]
2

[1,2]
0
*/
