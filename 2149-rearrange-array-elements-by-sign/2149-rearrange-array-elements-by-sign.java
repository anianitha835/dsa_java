class Solution {
    public int[] rearrangeArray(int[] nums) {
        int s=nums.length;
        int ans[]=new int[s];
        int p=0,n=0;
        int idx=0;
        while(p<s&&n<s){
            while(nums[p]<0)
                p++;
            while(nums[n]>0)
                n++;
            ans[idx++]=nums[p];
            ans[idx++]=nums[n];
            p++;
            n++;
        }
        
    
        return ans;
    }
}