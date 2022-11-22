class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        int dp[][]=new int[r+1][c+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return findPaths(r-1,c-1,obstacleGrid,dp);
    }
    private int findPaths(int i,int j,int[][] grids,int dp[][]){
        if(i<0 ||j<0) return 0;
        if(grids[i][j]==1) return 0;
         if(i==0 &&j==0) return 1;
        
         if(dp[i][j]!=-1) return dp[i][j];
        
         int up=findPaths(i-1,j,grids,dp);
         int left=findPaths(i,j-1,grids,dp);
        
        return dp[i][j]=up+left;
        
    }
}