//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
         HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(x[i], b[i]);
        
        int start = 0, end = w.length()-1, tmpstart=0;
        
        int max_so_far = 0, max_ending_here = 0;
        
        for(int i=0;i<w.length();i++){
            
            if(map.containsKey(w.charAt(i))) max_ending_here+=map.get(w.charAt(i));
            else max_ending_here += (int)w.charAt(i);
            
            if(max_so_far < max_ending_here){
                start = tmpstart;
                end = i;
                max_so_far = max_ending_here;
            }
            
            if(max_ending_here<0) {
                tmpstart = i+1;
                max_ending_here = 0;
            }
        }
        
        return w.substring(start, end+1);
    
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends