class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n-1;i++){//1 3 12 0 0
            if(nums[i]==0&&nums[i+1]!=0){
                int temp=nums[i+1];
                nums[i+1]=nums[s];
                nums[s]=temp;
                
            }
            else if(nums[i]==0&&nums[i+1]==0) continue;
            
            s++;
        }
    }
}