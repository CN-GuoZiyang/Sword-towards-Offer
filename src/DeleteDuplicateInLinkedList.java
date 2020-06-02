public class DeleteDuplicateInLinkedList {

    public ListNode deleteDuplication(ListNode pHead) {
        ListNode head = new ListNode(-1);
        head.next = pHead;
        ListNode pre = head, p = pHead, next;
        while(p != null && p.next != null) {
            next = p.next;
            if(p.val == next.val) {
                while(next != null && next.val == p.val) {
                    next = next.next;
                }
                pre.next = next;
                p = next;
            } else {
                pre = p;
                p = p.next;
            }
        }
        return head.next;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
