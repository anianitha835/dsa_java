class Solution {
    public int[] searchRange(int[] nums, int t) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==t){
                while(nums[l]<nums[m])l++;
                while(nums[h]>nums[m])h--;
                return new int[]{l,h};
            }
            else if(nums[m]>t)
                h=m-1;
            else
                l=m+1;
        }
        return new int[]{-1,-1};
    }
}