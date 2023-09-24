class Solution {
    double solve(int i, int j,int poured,double dp[][]){
        if(i<0 ||j<0 ||i<j)
            return 0.0;
        if(i==0&&j==0)
            return poured;
        
        if(dp[i][j]!=-1)return dp[i][j];
        double up_left=(solve(i-1,j-1,poured,dp)-1)/2.0;
        double up_right=(solve(i-1,j,poured,dp)-1)/2.0;
        
        if(up_left<0)
            up_left=0;
        if(up_right<0)
            up_right=0;
        
        return dp[i][j]=up_left+up_right;
    }
    public double champagneTower(int poured, int query_row, int query_glass) {
        double dp[][]=new double[101][101];
        for(double r[]:dp)
            Arrays.fill(r,-1);
        return Math.min(1.0,solve(query_row,query_glass,poured,dp));
    }
}