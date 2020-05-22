import java.util.ArrayList;
import java.util.Stack;

public class PrintLinkedListFromTail {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ListNode l = listNode;
        while(l != null) {
            stack.push(l.val);
            l = l.next;
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

    private ArrayList<Integer> ress = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        if(listNode != null) {
            printListFromTailToHead2(listNode.next);
            ress.add(listNode.val);
        }
        return ress;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
