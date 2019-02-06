/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>(
            new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (int i = 0; i < lists.length; i++)
            if (lists[i] != null) queue.add(lists[i]);
        
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (!queue.isEmpty()) {
            ListNode temp = queue.poll();
            cur.next = temp;
            cur = cur.next;
            if (temp.next != null) queue.add(temp.next);
        }
        
        return dummyHead.next;
    }
}