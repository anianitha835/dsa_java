class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int n=prices.length;
        int mini=prices[0];
        for(int i=1;i<n;i++){
            maxi=Math.max(maxi,prices[i]-mini);
            mini=Math.min(mini,prices[i]);
        }
        return maxi;
    }
}