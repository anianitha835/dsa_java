class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        int dp[][]=new int[r+1][c+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return findPaths(obstacleGrid,dp,r,c);
    }
    private int findPaths(int[][] grid,int dp[][],int n,int m){
       
        
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(grid[i][j]==1)
                    dp[i][j]=0;
                else if(i==0 && j==0)
                    dp[i][j]=1;
                
                else{
                    int l=0,up=0;
                    if(j>0) up=dp[i][j-1];
                    if(i>0) l=dp[i-1][j];
                   dp[i][j]=up+l;
                }
            }
        }
         
        
        return dp[n-1][m-1];
        
    }
}