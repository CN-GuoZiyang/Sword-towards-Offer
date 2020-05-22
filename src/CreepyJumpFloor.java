public class CreepyJumpFloor {

    public int JumpFloorII(int target) {
        if(target == 1) return 1;
        int[] dp = new int[target+1];
        dp[1] = 1;
        int sum = 1;
        for(int i = 2; i <= target; i ++) {
            dp[i] = sum+1;
            sum += dp[i];
        }
        return dp[target];
    }

}
