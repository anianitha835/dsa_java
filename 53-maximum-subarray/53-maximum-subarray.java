class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSoFar = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<n; i++){
            sum+= nums[i];
            if(sum > maxSoFar){
                maxSoFar = sum;
            }
                if(sum < 0){
                    sum = 0;
                }
                
            
        }
        return maxSoFar;
}
}