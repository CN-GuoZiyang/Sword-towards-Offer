public class FindInTwoDimArray {

    public boolean Find(int target, int[][] array) {
        if(array.length == 0) return false;
        if(array[0].length == 0) return false;

        int line = array.length;
        int col = array[0].length;
        int curl = line-1;
        int curc = 0;
        while (true) {
            if(curl == -1 || curc == col) break;
            int tmp = array[curl][curc];
            if(tmp < target) {
                curc ++;
            } else if(tmp > target) {
                curl --;
            } else {
                return true;
            }
        }
         return false;
    }

}
