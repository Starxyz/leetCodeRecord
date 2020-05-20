# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        pre, pre.next = self, head  # It just creates an attribute for the instance

        while pre.next and pre.next.next:
            a = pre.next
            b = a.next

            pre.next, b.next, a.next = b, a, b.next  # 确保self.next指向交换后的第一个

            pre = a

        return self.next


if __name__ == '__main__':
    a1 = ListNode(1)
    a2 = ListNode(2)
    a3 = ListNode(3)
    a4 = ListNode(4)

    a1.next = a2
    a2.next = a3
    a3.next = a4

    test = Solution()
    test.swapPairs(a1)
