/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (n == m) return head;
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = dummyHead;        
        // move cur to the m-th node
        ListNode front = null;// the head of section
        ListNode end = null;// the tail of section
        for (int i = 0; i < m - 1; i++) {
            cur = cur.next;
        }
        front = cur;
        
        cur = cur.next;// move cur to the m-th node
        end = cur;
        ListNode pre = null;
        
        for (int i = 0; i < n - m; i++) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        end.next = cur.next;
        cur.next = pre;
        front.next = cur;         
   
        return dummyHead.next;
    }
}