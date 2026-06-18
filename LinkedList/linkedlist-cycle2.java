public class Solution {
    public ListNode startPoint(ListNode slow,ListNode head) {
        ListNode ptr = head;
        while(ptr!=slow){
            ptr = ptr.next;
            slow = slow.next;
        }
        return ptr;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast)
            break;
        }
        if(fast == null || fast.next == null)
        return null;
        
        return startPoint(slow,head);
    }
}