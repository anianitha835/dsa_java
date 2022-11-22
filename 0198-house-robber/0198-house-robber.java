class Solution {
  
    public int rob(int[] nums) {
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int val=nums[i];
            if(i>1) val+=prev2;
            int curr=Math.max(val,prev);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
   
}