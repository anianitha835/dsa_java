class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int temp[]=new int[n-1];
        int temp2[]=new int[n-1];
        int ind=0;
        int ind2=0;
        if(n==1) return nums[0];
        for(int i=0;i<n;i++){
            if(i!=0) temp[ind++]=nums[i];
            if(i!=n-1) temp2[ind2++]=nums[i];
        }
        return Math.max(fun(temp),fun(temp2));
    }
   
    private int fun(int nums[]){
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int val=nums[i];
            if(i>1) val+=prev2;
            int curr=Math.max(val,prev);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
   
    }