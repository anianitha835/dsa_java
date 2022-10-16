class Solution {
    int n,maxval=(int)1e7;
    public int minDifficulty(int[] jobDifficulty, int d) {
        n= jobDifficulty.length;
        int[][] dp = new int[n][d+1];
        for(int i[]:dp){
            
            Arrays.fill(i,-1);
        }
            if(n<d) return -1;
        return solve(jobDifficulty,d,0,dp);
        
    }
    private int solve(int[] jobs,int d,int i,int[][] dp){
        if(n==i &&d==0) return 0;
        if(n==i || d==0 || n-i<d) return maxval;
        if(dp[i][d]!=-1) return dp[i][d];
        
        int max=0,ans=Integer.MAX_VALUE;
        for(int j=i;j<n;j++){
            max=Math.max(max,jobs[j]);
            ans=Math.min(ans,max+ solve(jobs,d-1,j+1,dp));
        }
        return dp[i][d]=ans;
    }
}