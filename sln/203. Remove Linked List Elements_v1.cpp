/*203. Remove Linked List Elements
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* dummyHead = new ListNode(0);
        dummyHead->next = head;
        ListNode* cur = dummyHead;
        
        while (cur->next != NULL) {
            if (cur->next->val == val) {
                ListNode *delNode = cur->next;
                cur->next = delNode->next;
                delete delNode;
            } else {
                cur = cur->next;
            }
        }
        ListNode *retNode = dummyHead->next;
        delete dummyHead;
        return retNode;
    }
};