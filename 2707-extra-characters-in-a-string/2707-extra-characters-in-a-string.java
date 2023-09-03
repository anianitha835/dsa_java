class Solution {
    public int solve(int i, String str,int n, HashSet<String> set,int dp[]) {
        if(i>=n) 
            return 0;
        
        if(dp[i]!=-1)
            return dp[i];
        
        int minextra=str.length();
        for(int ind=i;ind<n;ind++) {
            String s=str.substring(i,ind+1);
        
            int currextra=(!set.contains(s))?s.length():0;
            
            
            int rem=solve(ind+1, str, n, set,dp);
            int total=rem+currextra;
            minextra=Math.min(total,minextra);
        }
            return dp[i]=minextra;
        
        
    }
    public int minExtraChar(String s, String[] dictionary) {
        HashSet<String> set=new HashSet<>();
        int n=s.length();
        for(int i=0;i<dictionary.length;i++) {
            set.add(dictionary[i]);
        }
        int dp[]=new int[n];
         Arrays.fill(dp,-1);
        return solve(0,s,n,set,dp);
    }
}