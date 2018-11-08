/*
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (head == NULL || n < 1)
            return head;
        
        ListNode *cur = head;
        while (cur != NULL) {
            n--;
            cur = cur->next;
        }
        
        if (n == 0)// 1->2->3    n = 3  return 2->3
            head = head->next;
        
        if (n < 0) {//length - n = n from end
            cur = head;
            while (++n != 0) {
                cur = cur->next;
            }
            cur->next = cur->next->next;
        }
        //n > 0 means n > length, remove nothing
        return head;
    }
};