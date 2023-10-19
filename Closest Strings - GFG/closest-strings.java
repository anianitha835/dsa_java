//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int min=Integer.MAX_VALUE;
        int n=s.size();
        for(int i=0;i<n;i++){
            if(s.get(i).equals(word1)){
                for(int j=0;j<n;j++){
                    if(s.get(j).equals(word2)){
                    //System.out.println(s.get(j));
                    min=Math.min(Math.abs(j-i),min);
                    }
                }
            }
            
        }
        return min;
        
    }
};