import java.util.LinkedList;
import java.util.Queue;

public class UglyNumber {

    public int GetUglyNumber_Solution(int index) {
        if(index == 1) return 1;
        Queue<Integer>[] queues = new Queue[6];
        queues[2] = new LinkedList<>();
        queues[3] = new LinkedList<>();
        queues[5] = new LinkedList<>();
        queues[2].offer(2);
        queues[3].offer(3);
        queues[5].offer(5);
        int res=-1;
        for(int i = 2; i <= index; i ++) {
            if(queues[2].peek() <= queues[3].peek() && queues[2].peek() <= queues[5].peek()) {
                res = queues[2].poll();
            } else if(queues[3].peek() <= queues[2].peek() && queues[3].peek() <= queues[5].peek()) {
                res = queues[3].poll();
            } else {
                res = queues[5].poll();
            }
            if(!queues[2].isEmpty() && res == queues[2].peek()) queues[2].poll();
            if(!queues[3].isEmpty() && res == queues[3].peek()) queues[3].poll();
            if(!queues[5].isEmpty() && res == queues[5].peek()) queues[5].poll();
            queues[2].offer(res*2);
            queues[3].offer(res*3);
            queues[5].offer(res*5);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new UglyNumber().GetUglyNumber_Solution(6));
    }

}
