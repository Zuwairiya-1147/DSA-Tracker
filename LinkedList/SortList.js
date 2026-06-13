class Solution {
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode curr = temp;

        while(list1 != null && list2 != null) {
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }
        curr.next = (list1 != null)? list1 : list2;
        return temp.next;
    }
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode middle = findMiddle(head);
        ListNode leftNode = head;
        ListNode rightNode = middle.next;

        middle.next = null;
        
        leftNode = sortList(leftNode);
        rightNode = sortList(rightNode);

        return merge(leftNode, rightNode);
    }
}