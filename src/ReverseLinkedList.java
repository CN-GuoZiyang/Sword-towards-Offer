public class ReverseLinkedList {

    public ListNode ReverseList(ListNode head) {
        if(head == null) return null;
        ListNode pre = null, next = null;
        while(head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
