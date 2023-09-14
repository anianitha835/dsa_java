//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int pal(String n){
        int l=0;
        int r=n.length()-1;
        while(l<=r) {
            if(n.charAt(l)!=n.charAt(r))
            return 0;
            l++;
            r--;
        }
        return 1;
    }
    int isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        while(n!=0) {
            sum+=n%10;
            n/=10;
        }
        String str=Integer.toString(sum);
        return pal(str);
    }
}