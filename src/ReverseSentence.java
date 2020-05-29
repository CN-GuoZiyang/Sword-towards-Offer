import java.util.Stack;

public class ReverseSentence {

    public String ReverseSentence(String str) {
        if(str == null) return null;
        String[] splits = str.split(" ");
        if(splits.length < 2) return str;
        StringBuilder builder = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for(String split : splits) {
            stack.push(split);
        }
        builder.append(stack.pop());
        while(!stack.isEmpty()) {
            builder.append(" ").append(stack.pop());
        }
        return builder.toString();
    }

}
