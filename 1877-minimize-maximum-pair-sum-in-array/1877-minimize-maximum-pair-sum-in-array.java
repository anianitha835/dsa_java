class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=n-1;
        int mini=Integer.MIN_VALUE;
        while(i<j){
            int sum=nums[i]+nums[j];
            mini=Math.max(sum,mini);
            i++;
            j--;
        }
        return mini;
    }
}