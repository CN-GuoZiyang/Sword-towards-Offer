import java.util.Arrays;

public class JudgePostOrderOfBST {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        if(sequence.length == 1) return true;
        int root = sequence[sequence.length-1];
        int mid = 0;
        for(mid = 0; mid < sequence.length-1; mid ++) {
            if(sequence[mid] > root) break;
        }
        for(int after = mid; after < sequence.length-1; after ++) {
            if(sequence[after] < root) return false;
        }
        if(mid == 0) {
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence, mid, sequence.length-1));
        } else if(mid == sequence.length-1) {
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, mid));
        } else {
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, mid)) && VerifySquenceOfBST(Arrays.copyOfRange(sequence, mid, sequence.length - 1));
        }
    }

    public static void main(String[] args) {
        new JudgePostOrderOfBST().VerifySquenceOfBST(new int[]{4,6,7,5});
    }

}
