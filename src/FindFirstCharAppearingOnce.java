import java.util.LinkedList;
import java.util.Queue;

public class FindFirstCharAppearingOnce {

    int[] chars = new int[129];
    Queue<Character> cq = new LinkedList<>();

    //Insert one char from stringstream
    public void Insert(char ch) {
        if(chars[ch] < 2) {
            cq.add(ch);
            chars[ch] ++;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        if(cq.isEmpty()) return '#';
        while(!cq.isEmpty()) {
            char c = cq.peek();
            if(chars[c] == 1) return c;
            else cq.poll();
        }
        return '#';
    }

}
