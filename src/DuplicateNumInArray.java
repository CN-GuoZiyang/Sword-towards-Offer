public class DuplicateNumInArray {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] bools = new boolean[length];
        for(int i = 0; i < length; i ++) {
            if(bools[numbers[i]]) {
                duplication[0] = numbers[i];
                return true;
            }
            bools[numbers[i]] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        new DuplicateNumInArray().duplicate(new int[]{2,1,3,1,4}, 5, new int[1]);
    }


}
