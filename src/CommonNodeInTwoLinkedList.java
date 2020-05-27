import java.util.Stack;

//TODO 利用长度解决
public class CommonNodeInTwoLinkedList {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while(pHead1 != null) {
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while(pHead2 != null) {
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode last = null;
        while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()) {
            stack1.pop();
            last = stack2.pop();
        }
        return last;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
