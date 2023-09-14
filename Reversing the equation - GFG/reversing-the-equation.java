//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String s)
    {
        // your code here
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        
        int n=s.length();
        int i=n-1;
        while(i>=0){
            
            while(i>=0 &&s.charAt(i)!='*' &&s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)!='/') {
                
                sb.append(s.charAt(i));
                
                i--;
            }
            
            if(sb.length()==0) {
            ans.append(s.charAt(i));
            //System.out.println(ans);
            i--;
            }
            else {
            sb.reverse();
            ans.append(sb.toString());
            
            sb.setLength(0);
            }
            
                
            }
            return ans.toString();//2*5+3-
            
        }
        
         
                
            
    }
        
   