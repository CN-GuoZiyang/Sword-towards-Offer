import java.util.ArrayList;

public class TwoNumSumOfS {

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = array.length - 1;
        while(i < j) {
            int a = array[i];
            int b = array[j];
            if(a + b == sum) {
                res.add(a);
                res.add(b);
                break;
            } else if(a + b < sum) {
                i ++;
            } else {
                j --;
            }
        }
        return res;
    }

}
