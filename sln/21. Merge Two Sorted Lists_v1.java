/*21. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2;
        }
        
        ListNode head = l1.val < l2.val ? l1 : l2;
        ListNode cur1 = head == l1 ? l1 : l2;
        ListNode cur2 = head == l1 ? l2 : l1;
        ListNode pre = null;// store the little node
        ListNode tmp = null;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                pre = cur1;
                cur1 = cur1.next;
            } else {// note that we don't change cur1 in this block
                tmp = cur2.next;
                
                pre.next = cur2;
                
                cur2.next = cur1;
                
                pre = cur2;//store the little node
                
                cur2 = tmp;// l2
            }
        }
        pre.next = cur1 == null ? cur2 : cur1;
        
        return head;        
    }
}
