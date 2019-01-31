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
        if (head == null) return null;// promise head.next is valid
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;// a pointer before sublist
        for (int i = 0; i < m-1; i++)
            pre = pre.next;
        
        ListNode start = pre.next;//a head pointer of sublist
        ListNode then = start.next;//a pointer to reverse
        
        for (int i = 0; i < n-m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        
        return dummy.next;
    }
}

/*
dummy->1(pre)->2(start)-> 3(then)->4->5->null
for(int i=0; i<2; i++)

first round
start.next = then.next
dummy->1(pre)->2(start)-> 4->5->null
then.next = pre.next
3(then)->2(start)-> 4->5->null
pre.next = then
dummy->1(pre)->3(then)->2(start)-> 4->5->null
then = start.next
dummy->1(pre)->3->2(start)-> 4(then) ->5->null

second round
start.next = then.next
dummy->1(pre)->3->2(start)-> 5->null
then.next = pre.next
4(then)->3->2(start)-> ->5->null
pre.next = then
dummy->1(pre)->4(then)->3->2(start)-> 5->null
then = start.next
dummy->1(pre)-> 4->3->2(start) ->5(then)->null

done!
*/