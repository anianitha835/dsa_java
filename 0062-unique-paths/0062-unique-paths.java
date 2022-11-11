class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int[] row:dp) Arrays.fill(row,-1);
       
       for(int r=0;r<m;r++){
           for(int c=0;c<n;c++){
               if(r==0 &&c==0) dp[0][0]=1;
               else{
                   int up=0,left=0;
                   if(r>0)up=dp[r-1][c];
                   if(c>0) left=dp[r][c-1];
                   dp[r][c]=up+left;
               }
           }
       }
        return dp[m-1][n-1];
    }
}
        
        
   