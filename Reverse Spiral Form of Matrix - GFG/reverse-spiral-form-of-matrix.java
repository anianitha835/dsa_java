//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        int ans[] = new int[R*C];
        int ind=R*C-1;
        int left=0,right=a[0].length-1,up=0,down=a.length-1;
        
        while(ind>=0){
        for(int i=left;i<=right &&ind>=0;i++){
            ans[ind--] = a[up][i];
        }
        up++;
        for(int i=up;i<=down &&ind>=0;i++){
            ans[ind--] = a[i][right];
        }
        right--;
        for(int i=right;i>=left  &&ind>=0;i--){
            ans[ind--] = a[down][i];
        }
        down--;
        for(int i=down;i>=up  &&ind>=0;i--){
            ans[ind--] = a[i][left];
        }
        left++;

        }
        return ans;
    }
}