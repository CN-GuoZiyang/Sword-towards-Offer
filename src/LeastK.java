import java.util.ArrayList;
import java.util.PriorityQueue;

public class LeastK {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input.length == 0) return res;
        if(k > input.length) return res;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < input.length; i ++) {
            queue.add(input[i]);
        }
        for(int i = 0; i < k; i ++) {
            res.add(queue.poll());
        }
        return res;
    }

}
