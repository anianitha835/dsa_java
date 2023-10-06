class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(nums[m]>nums[h])
                l=m+1;
            else
                h=m;
        }
        return nums[l];
    }
}