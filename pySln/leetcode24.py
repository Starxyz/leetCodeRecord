# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy

        while head and head.next:
            # init node
            first_node = head
            second_node = head.next

            # swap nodes
            prev.next = second_node
            first_node.next = second_node.next
            second_node.next = first_node

            # reinit node
            head = first_node.next
            prev = first_node

        return dummy.next
        
