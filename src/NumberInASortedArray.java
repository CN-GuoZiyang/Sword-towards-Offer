public class NumberInASortedArray {

    public int GetNumberOfK(int [] array , int k) {
        if(array.length == 0) return 0;
        int lo = 0;
        int hi = array.length-1;
        while(lo <= hi) {
            int mid = lo+((hi-lo)>>1);
            if(array[mid] >= k) {
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        int count = 0;
        while(lo != array.length && array[lo] == k) {
            count ++;
            lo ++;
        }
        return count;
    }

    public static void main(String[] args) {
        new NumberInASortedArray().GetNumberOfK(new int[]{1,2,3,3,3,3}, 3);
    }

}
