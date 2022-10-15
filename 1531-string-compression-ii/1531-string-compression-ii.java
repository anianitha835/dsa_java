class Solution {
    int[][] dp;
    char[] chars;
    int n;
    public int getLengthOfOptimalCompression(String s, int k) {
        this.n=s.length();
        this.chars=s.toCharArray();
        this.dp=new int[n][k+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(0,k);
        
    }
    private int helper(int i,int k){
        if(k<0) return n;
        if(n<=i+k) return 0;
        int ans=dp[i][k];
        if(dp[i][k]!=-1)return ans;
        ans=helper(i+1,k-1);
        
        int len=0,same=0,diff=0;
        for(int j=i;j<n &&diff<=k;j++){
            if(j<n &&chars[j]==chars[i]){
                same++;
                if(same<=2 ||same==10 ||same==100) len++;
            }
                else{
                    diff++;
                }
            
        
        ans=Math.min(ans,len+helper(j+1,k-diff));
    }
    dp[i][k]=ans;
    return ans;
}
}