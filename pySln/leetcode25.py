class Solution:
    """
    1、定义一个函数反转链表
    2、k个一组划分，并送入链表逆序函数
    3、定义好哨兵，保证翻转不出错
    """
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        def _reverse(head):
            prev = None
            cur = head
            while cur:
                cur.next, cur, prev = prev, cur.next, cur
            
            return prev

        dummy = ListNode(-1)
        dummy.next = head

        pre = dummy
        end = dummy

        while end:
            for i in range(k):
                if end:
                    end = end.next

            # 最后一组不足k个节点，直接结束循环
            if not end:
                break
            
            # 构造待反转的链表，需要把这一组最后一个节点的next置空
            next_group = end.next
            end.next = None

            start_node = pre.next
            pre.next = _reverse(start_node) 

            start_node.next = next_group    # 连接下一个group

            # 重新制定哨兵的位置
            pre = start_node
            end = start_node

        
        return dummy.next
