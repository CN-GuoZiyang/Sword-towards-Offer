// TODO
public class ConstructMultipleArray {

    public int[] multiply(int[] A) {
        if(A == null || A.length == 0) return null;
        int length = A.length;
        int[] B = new int[length];
        for(int i = 0; i < length; i ++) {
            if(i == 0) {
                B[i] = 1;
                continue;
            }
            B[i] = B[i-1] * A[i-1];
        }
        int tmp = 1;
        for(int i = length-2; i >= 0; i --) {
            tmp *= A[i+1];
            B[i] *= tmp;
        }
        return B;
    }

}
