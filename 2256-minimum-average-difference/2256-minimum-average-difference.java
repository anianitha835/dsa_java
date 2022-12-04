class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long prefix[] = new long[n];
        long mini = Integer.MAX_VALUE;
        long ans=0;
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]= prefix[i-1]+nums[i];
            
        }
        long diff=0;
        for(int i=0;i<n;i++){
            long val1=prefix[i]/(i+1);
            long val2=0;
            if(i!=n-1)
                val2 = (prefix[n-1]-prefix[i])/(n-i-1);
            if(i==n-1) diff=val1; 
            else diff=Math.abs(val1-val2);
           
            if(diff<mini){
                mini=diff;
                ans=i;
            }
        }
        return (int)ans;
    }
}