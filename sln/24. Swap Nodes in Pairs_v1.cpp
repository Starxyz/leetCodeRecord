/*224. Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
Note:

Your algorithm should use only constant extra space.
You may not modify the values in the list's nodes, only nodes itself may be changed.
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
    ListNode* swapPairs(ListNode* head) {
        ListNode* dummyHead = new ListNode(0);
        dummyHead->next = head;
        ListNode* p = dummyHead;
        while (p->next && p->next->next) {
            ListNode* node1 = p->next;
            ListNode* node2 = node1->next;
            ListNode* next;
            
            // swap
            next = node2->next;
            node2->next = node1;
            node1->next = next;
            
            p->next = node2;
            p = node1;                   
            // example: dummy-> 1(node1) -> 2(node2) -> 3
            //          dummy-> 2(node2) -> 1(node1) -> 3
        }
        
        ListNode* retNode = dummyHead->next;
        delete dummyHead;
        return retNode;
    }
};