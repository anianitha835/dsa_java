class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int c=1;
        int maxi=0;
        int ans=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1])
                c++;
            else
                c=1;
            if(c>maxi)
            {
                maxi=c;
                ans=arr[i];
            }
        }
        return ans;
    }
}