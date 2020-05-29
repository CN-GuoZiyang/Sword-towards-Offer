public class PokerContinuous {

    public boolean isContinuous(int [] numbers) {

        if(numbers == null || numbers.length == 0) return false;
        int[] pokers = new int[14];
        int min = 20;
        int max = -1;
        int zeroNum = 0;
        for(int i = 0; i < numbers.length; i ++) {
            if(numbers[i] == 0) zeroNum ++;
            else {
                if(numbers[i] < min) min = numbers[i];
                if(numbers[i] > max) max = numbers[i];
                if(pokers[numbers[i]] != 0) return false;
                pokers[numbers[i]] = 1;
            }
        }
        if(max - min >= 5) return false;

        return false;
    }

}
