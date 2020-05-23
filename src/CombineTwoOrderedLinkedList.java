public class CombineTwoOrderedLinkedList {

    public ListNode Merge(ListNode list1,ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head = null;
        if(list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        ListNode res = head;
        while(true) {
            if(list1 == null) {
                head.next = list2;
                break;
            }
            if(list2 == null) {
                head.next = list1;
                break;
            }
            if(list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        return res;

    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
