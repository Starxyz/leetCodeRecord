"""
思路， 首先把l1 和 l2变成数字，然后直接得到相加的结果
最后把这个结果转换为结果链表
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        s1 = ''
        s2 = ''
        while l1:
            s1 += str(l1.val)
            l1 = l1.next

        while l2:
            s2 += str(l2.val)
            l2 = l2.next
        
        s1 = ''.join(reversed(list(s1)))
        s2 = ''.join(reversed(list(s2)))

        s = int(s1) + int(s2)
        
        dummy = ListNode(-1)
        head = dummy
        for ch in str(s)[::-1]:
            dummy.next = ListNode(ch)
            dummy = dummy.next
        
        return head.next

    

