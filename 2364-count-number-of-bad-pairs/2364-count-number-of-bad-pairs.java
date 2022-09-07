class Solution {
    public long countBadPairs(int[] nums) {
       //j- nums[j] != i-nums[i]
        long ans=0;
        long goodPairs=0;
        int n=nums.length;
        long totalPairs =(long)n*(n-1)/2; 
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            goodPairs+=mp.getOrDefault(i-nums[i],0);
            mp.put(i-nums[i], mp.getOrDefault(i-nums[i],0)+1);
                
        }
       ans =totalPairs - goodPairs;
     
        return ans;
    }
}