import java.util.ArrayList;

public class SuccessiveSequenceSumOfS {

    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low = 1, high = 2;
        while(low < high) {
            int tmp = (high + low) * (high - low + 1) / 2;
            if(tmp == sum) {
                ArrayList<Integer> tres = new ArrayList<>();
                for(int i = low; i <= high; i ++) {
                    tres.add(i);
                }
                res.add(tres);
                low ++;
            } else if (tmp < sum) {
                high ++;
            } else {
                low ++;
            }
        }
        return res;

    }

}
