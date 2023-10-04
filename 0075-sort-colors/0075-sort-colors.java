class Solution {
     void swap(int i, int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0;
        int m=0;
        int h=n-1;
        while(m<=h){
            if(nums[m]==0){
                swap(l,m,nums);
                m++;
                l++;
            }
            else if(nums[m]==2){
                swap(h,m,nums);
                h--;
            }
            else
                m++;
                
        }
        
    }
}