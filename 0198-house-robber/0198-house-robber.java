class Solution {
  
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n-1,nums,dp);
    }
    private int helper(int ind,int arr[],int dp[]){
        if(ind==0) return arr[ind];
        if(ind<0) return 0;
        
        if(dp[ind]!=-1) return dp[ind];
        int rob=arr[ind]+helper(ind-2,arr,dp);
        int notRob = helper(ind-1,arr,dp);
        return dp[ind]=Math.max(rob,notRob);
        
    }
   
}