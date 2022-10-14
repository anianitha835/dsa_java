//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        Map<Character,Integer> hm = new HashMap<>();
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        if(arr1.length!=arr2.length) return false;
        for(int i=0;i<arr1.length;i++){
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
            hm.put(arr2[i],hm.getOrDefault(arr2[i],0)-1);
        }
        for(int i:hm.values()){
            if(i!=0) return false;
        }
       
        return true;
    }
}