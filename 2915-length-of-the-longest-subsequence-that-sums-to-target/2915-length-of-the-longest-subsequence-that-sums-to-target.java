class Solution {
   
    public int solve(int i,List<Integer> nums, int t,int n,int[][] dp) {
        if(t==0)
            return 0;
        
        
        if(i>=n || t<0)
            return -1001;
        if(dp[i][t]!=-1)
            return dp[i][t];
        
        int p=1+solve(i+1, nums,t-nums.get(i),n,dp);
        int np=solve(i+1,nums,t,n,dp);
        return dp[i][t]=Math.max(p,np);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int dp[][]=new int[1001][1001];
        for(int r[]:dp)
            Arrays.fill(r,-1);
        
        int ans=solve(0,nums,target,nums.size(),dp);
        return (ans>0)?ans:-1;
    }
}