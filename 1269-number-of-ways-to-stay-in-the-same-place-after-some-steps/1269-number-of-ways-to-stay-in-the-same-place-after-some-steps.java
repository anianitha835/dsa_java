class Solution {
    long solve(int i,int n,int c,long[][] dp){
        if(i<0 ||i>=n ||c<0)return 0;
        if(c==0 &&i==0) return 1;
            
        
        if(dp[i][c]!=-1)
            return dp[i][c];
        
        long l=solve(i-1,n,c-1,dp)%1000000007;
        long r=solve(i+1,n,c-1,dp)%1000000007;
        long s=solve(i,n,c-1,dp)%1000000007;
       return dp[i][c]=((l+r+s)%1000000007);
       
        
    }
    public int numWays(int steps, int arrLen) {
        long dp[][]=new long[501][501];
        for(long r[]:dp)
            Arrays.fill(r,-1);
        
        //arrLen=Math.min(arrLen,steps);
        return (int)(solve(0,arrLen,steps,dp));
    }
}