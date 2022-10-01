class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        int count=helper(s,0,dp);
        return count;
    }
    private int helper(String s, int i,int[] dp){
        if(i==s.length()){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1)
            return dp[i];
        
        int oneWay=helper(s,i+1,dp);
        int twoWays=0;
        if(i+2<=s.length() &&Integer.parseInt(s.substring(i,i+2))<=26){
            twoWays=helper(s,i+2,dp); 
        }
        dp[i]=oneWay+twoWays;
        return dp[i];
    }
    
}