class Solution {
    public int[] rearrangeArray(int[] nums) {
        int s=nums.length;
        int ans[]=new int[s];
        int p=0,n=0;
        int idx1=0,idx2=1;
        for(int i:nums){
            if(i>0){
                ans[idx1]=i;
                idx1+=2;
            }
            if(i<0){
                ans[idx2]=i;
                idx2+=2;
            }
        }
        
    
        return ans;
    }
}