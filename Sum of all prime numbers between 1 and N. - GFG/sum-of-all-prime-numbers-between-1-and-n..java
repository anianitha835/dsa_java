//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public long prime_Sum(int n)
    {
        // code here
        long sum=0;
        for(int i=2;i<=n;i++){
        int flag=0;
        for(int j=2;j<=Math.sqrt(i);j++) {
            if(i%j==0){
                flag++;
                break;
            }
            
        }
        if(flag==0)
        sum+=i;
        
    }
    return sum;
}
}