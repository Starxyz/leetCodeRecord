# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        def _reverse(head):

            if not head or not head.next:
                return head
            
            cur = _reverse(head.next)   # 这一步比较容易忘记
            head.next.next = head
            head.next = None

            return cur


        return _reverse(head)


