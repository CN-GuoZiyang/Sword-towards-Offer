import java.util.Stack;

public class StackWithMin {

    Stack<Integer> raw = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int node) {
        raw.push(node);
        if(min.isEmpty()) {
            min.push(node);
        } else if(min.peek() >= node) {
            min.push(node);
        }
    }

    public void pop() {
        int tmp = raw.pop();
        if(tmp == min.peek()) min.pop();
    }

    public int top() {
        return raw.peek();
    }

    public int min() {
        return min.peek();
    }

}
