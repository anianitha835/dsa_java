class Solution {
    public int isPalindrome(int i,int j,String s,int dp[][]){
    
        if(i>j)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        if(s.charAt(i)==s.charAt(j))
            return dp[i][j]=isPalindrome(i+1,j-1,s,dp);
        else
            return 0;
        
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int r[]:dp)
            Arrays.fill(r,-1);
        
        int maxLen=0;
        int startP=-1;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                if(isPalindrome(i,j,s,dp)==1){
                    if(j-i+1>maxLen){
                        maxLen=j-i+1;
                        startP=i;
                }
                }
            }
        }
        return s.substring(startP,startP+maxLen);
    }
}