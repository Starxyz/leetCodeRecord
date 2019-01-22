import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        return addLists(a, b, 0);
    }
    
    private ListNode addLists(ListNode a, ListNode b, int carry) {
        if (a == null && b == null && carry == 0) {
            return null;
        }
        
        ListNode result = new ListNode(0);
        int value = carry;
        if (a != null)
            value += a.val;
        if (b != null)
            value += b.val;
        result.val = value % 10;
        ListNode more = addLists(a == null ? null : a.next,
                                 b == null ? null : b.next,
                                 value >= 10 ? 1 : 0);
        result.next = more;
        return result;
    }
}