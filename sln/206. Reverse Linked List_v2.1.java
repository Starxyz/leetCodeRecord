/*206. Reverse Linked List
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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
    
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        head = reverse(head);
        head.next = null;
        return first;
    }
    
    // 尾结点是递归终止条件，此时尾结点和上一个结点已知，可以逆序
    // 缺点是需要一个全局变量保存尾结点。
    ListNode first;
    private ListNode reverse(ListNode node) {
        if (node.next == null) {
            first = node;
            return node;
        }
        ListNode p = reverse(node.next);
        p.next = node;
        return node;
    }
}