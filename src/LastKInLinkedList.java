public class LastKInLinkedList {

    public ListNode FindKthToTail(ListNode head, int k) {
        if(head == null) return null;
        if(k < 1) return null;
        ListNode low = head;
        ListNode high = low;
        for(int i = 0; i < k-1; i ++) {
            high = high.next;
            if(high == null) return null;
        }
        while(high.next != null) {
            low = low.next;
            high = high.next;
        }
        return low;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
