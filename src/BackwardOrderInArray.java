//TODO
public class BackwardOrderInArray {

    private int count = 0;

    public int InversePairs(int [] array) {
        if(array == null || array.length < 2) return 0;
        mergeSort(array, 0, array.length-1);
        return count;
    }

    private void mergeSort(int[] array, int lo, int hi) {
        if(lo >= hi) return;
        int mid = lo+((hi-lo)>>1);
        mergeSort(array, lo, mid);
        mergeSort(array, mid+1, hi);
        merge(array, lo, mid, hi);
    }

    private void merge(int[] array, int lo, int mid, int hi) {
        int[] tmp = new int[hi-lo+1];
        int index = 0;
        int p1 = lo, p2 = mid+1;
        while(p1 <= mid && p2 <= hi) {
            if(array[p1] <= array[p2]) {
                tmp[index] = array[p1];
                index ++;
                p1 ++;
            } else {
                // 出现逆序对
                // 左侧已经有序，第p1个到mid个都比p2大
                count += (mid - p1 + 1);
                if(count >= 1000000007) count %= 1000000007;
                tmp[index] = array[p2];
                index ++;
                p2 ++;
            }
        }
        while (p1 <= mid) {
            tmp[index] = array[p1];
            p1 ++;
            index ++;
        }
        while (p2 <= hi) {
            tmp[index] = array[p2];
            p2 ++;
            index ++;
        }
        if (tmp.length >= 0) System.arraycopy(tmp, 0, array, lo, tmp.length);
    }
    
}
