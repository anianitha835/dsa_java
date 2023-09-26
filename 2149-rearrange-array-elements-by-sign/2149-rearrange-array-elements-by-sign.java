class Solution {
    public int[] rearrangeArray(int[] nums) {
        int s=nums.length;
        int ans[]=new int[s];
        int[] p=new int[s/2];
        int[] n=new int[s/2];
        int idx1=0,idx2=0;
        for(int i=0;i<s;i++){
            if(nums[i]<0)
                n[idx1++]=nums[i];
            else
                p[idx2++]=nums[i];
        }
        int ind=0;
        for(int i=0;i<s/2;i++) {
            ans[ind++]=p[i];
            ans[ind++]=n[i];
        }
        return ans;
    }
}