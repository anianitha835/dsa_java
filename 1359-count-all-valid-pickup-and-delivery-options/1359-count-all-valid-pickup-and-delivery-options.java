class Solution {
    public int countOrders(int n) {
        if(n==1)
            return 1;
        
        long res=1;
        for(int i=2;i<=n;i++) {
            int spaces=(i-1)*2+1;
            long sum=spaces*(spaces+1)/2;
            
        res=(res*sum)%1000000007;
        
        }
        return (int)res;
    }
}