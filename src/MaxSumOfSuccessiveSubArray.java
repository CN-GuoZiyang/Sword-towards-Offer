public class MaxSumOfSuccessiveSubArray {

    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0) return 0;
        int tmpSum = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i ++) {
            if(tmpSum+array[i] > array[i]) {
                tmpSum += array[i];
            } else {
                tmpSum = array[i];
            }
            if(tmpSum > max) {
                max = tmpSum;
            }
        }
        return max;
    }

    public int FindGreatestSumOfSubArrayDp(int[] array) {
        if(array.length == 0) return 0;
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int max = dp[0];
        for(int i = 1; i < array.length; i ++) {
            dp[i] = Math.max(dp[i-1]+array[i], array[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

}
