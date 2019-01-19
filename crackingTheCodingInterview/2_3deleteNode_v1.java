import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Remove {
    public boolean removeNode(ListNode pNode) {
        // write code here
        if (pNode == null || pNode.next == null)
            return false;
        
        pNode.val = pNode.next.val;
        pNode.next = pNode.next.next;
        return true;
    }
}