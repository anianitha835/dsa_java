class Solution {
    public int solve(int i, int[] nums, int target,int n,int[][] dp) {
        if(i>=n)
        return 0;
        
        if(target<0)
            return 0;
        
        if(target==0) 
            return 1;
        
        if(dp[i][target]!=-1)
            return dp[i][target];
        
        int take=0;
        //if(nums[i]<=target)
        take=solve(0,nums,target-nums[i],n,dp);
        int not_take=solve(i+1,nums,target,n,dp);
        
        return dp[i][target]=take+not_take;
        
        }
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        int dp[][]=new int[201][1001];
        for(int[] r:dp)
            Arrays.fill(r,-1);
        
        return solve(0,nums,target,n,dp);
    }
}