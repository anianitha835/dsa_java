class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            int sum=0;
            if(nums[i]==k)c++;
            int target=k-nums[i];
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                if(sum==target)c++;
                //if(sum>target)break;
            }
        }
        return c;
    }
}