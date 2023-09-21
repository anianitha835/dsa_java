class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int j=0;
        int count=(nums[0]==1)?1:0;
        int ans=0;
        if(n==1)
            return (nums[0]==1)?1:0;
        
        for(int i=1;i<n;i++){
            if(nums[i]==1 &&nums[i-1]==0)
                count=1;
            else if(nums[i]==1&&nums[i-1]==1)
                count++;
                
            
          ans=Math.max(ans,count);  
        }
        return ans;
    }
}