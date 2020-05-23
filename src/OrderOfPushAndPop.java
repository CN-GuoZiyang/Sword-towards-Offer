import java.util.Stack;

// TODO
public class OrderOfPushAndPop {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i = 0; i < pushA.length; i ++) {
            stack.push(pushA[i]);
            while(!stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j ++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new OrderOfPushAndPop().IsPopOrder(
                new int[]{1, 2, 3, 4, 5},
                new int[]{4, 5, 3, 2, 1}
        ));
    }

}
