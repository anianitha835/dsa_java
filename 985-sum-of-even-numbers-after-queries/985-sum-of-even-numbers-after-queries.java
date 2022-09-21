class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int arr[] = new int[nums.length];
        int evenSum=0;
        for(int i:nums){
            if(i%2==0)
                evenSum+=i;
        }
        for(int i=0;i<queries.length;i++){
            int index=queries[i][1];
            if(nums[index]%2==0){
                evenSum-=nums[index];
            }
            nums[index]+=queries[i][0];
            if(nums[index]%2==0){
                evenSum+=nums[index];
            }
            arr[i]=evenSum;
        }
        
         return arr;
            
        }
        
    }
    
    


