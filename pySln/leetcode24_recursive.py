class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head

        # init nodes
        first_node = head
        second_node = head.next

        # swap nodes
        first_node.next = self.swapPairs(second_node.next)
        second_node.next = first_node

        return second_node

