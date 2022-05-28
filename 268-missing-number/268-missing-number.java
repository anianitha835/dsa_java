class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int sum = 0;
        for(int i = 0;i<=nums.length;i++){
            actualSum+= i;
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return actualSum - sum;
     }
    
}