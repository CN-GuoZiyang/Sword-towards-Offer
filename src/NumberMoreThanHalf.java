public class NumberMoreThanHalf {

    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0) return 0;
        if(array.length == 1) return array[0];
        int tmp = array[0];
        int times = 1;
        for(int i = 1; i < array.length; i ++) {
            if(array[i] == tmp) times ++;
            else times --;
            if(times == 0) {
                tmp = array[i];
                times = 1;
            }
        }
        times = 0;
        for(int i = 0; i < array.length; i ++) {
            if(array[i] == tmp) times ++;
        }
        return (times > array.length/2) ? tmp : 0;
    }

}
