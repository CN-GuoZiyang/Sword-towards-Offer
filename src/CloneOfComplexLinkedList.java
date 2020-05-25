import java.util.HashMap;

public class CloneOfComplexLinkedList {

    HashMap<RandomListNode, RandomListNode> map = new HashMap<>();

    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) return null;
        if(map.containsKey(pHead)) {
            return map.get(pHead);
        }
        RandomListNode node = new RandomListNode(pHead.label);
        map.put(pHead, node);
        node.next = Clone(pHead.next);
        node.random = Clone(pHead.random);
        return node;
    }

    class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

}
