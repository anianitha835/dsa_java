class Solution {
  
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,dp,n);
    }
    private int helper(int arr[],int dp[],int n){
        dp[0]=arr[0];
      
       
        for(int i=1;i<arr.length;i++){
            int val=arr[i];
            if(i>1) val+=dp[i-2];
            dp[i]=Math.max(val,dp[i-1]);
        }
        return dp[n-1];
    }
   
}