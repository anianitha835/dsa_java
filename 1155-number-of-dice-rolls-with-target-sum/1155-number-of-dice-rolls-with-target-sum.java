class Solution {
    public int numRollsToTarget(int n, int k, int target) {
          if(target > n*k) return 0;
        int dp[][]=new int[n+1][target+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return helper(n,k,target,dp);
        
    }
    
    private int helper(int n,int k,int sum,int[][] dp){
        if(n==0) return sum==0?1:0;
        
        if(dp[n][sum]!=-1) return dp[n][sum];
        int ways=0;
        for(int i=1;i<=k;i++){
            if(sum-i>=0){
                ways=(ways+(helper(n-1,k,sum-i,dp)))%1000000007;
            }
        }
        return dp[n][sum]=ways;
      }
}
        
    
