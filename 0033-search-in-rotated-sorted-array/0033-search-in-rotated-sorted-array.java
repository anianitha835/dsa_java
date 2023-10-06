class Solution {
    public int findPivot(int nums[],int n){
        int l=0;
        int h=n-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(nums[m]>nums[h])
                l=m+1;
            else
                h=m;
        }
        return l;
    }
    
    public int binarySearch(int l,int h, int nums[],int t){
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==t)return m;
            else if(nums[m]>t)
                h=m-1;
            else
                l=m+1;
            
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int idx=-1;
        int pivot=findPivot(nums,n);
        idx=binarySearch(0,pivot-1,nums,target);
        if(idx!=-1)return idx;
        idx=binarySearch(pivot,n-1,nums,target);
        return idx;
    }
}