import java.util.Comparator;
import java.util.PriorityQueue;

// TODO
public class FindMedianInStream {

    int count = 0;
    // 小顶堆保存比中位数大的数，大顶堆保存比中位数小的数
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    public void Insert(Integer num) {
        count++;
        if ((count & 1) == 0) {
            maxHeap.offer(num);
            num = maxHeap.poll();
            minHeap.offer(num);
        } else {
            minHeap.offer(num);
            num = minHeap.poll();
            maxHeap.offer(num);
        }
    }

    public Double GetMedian() {
        if (count == 0) return null;
        if ((count & 1) == 1) return (double) maxHeap.peek();
        else return (minHeap.peek() + maxHeap.peek()) / 2.0;
    }

}
