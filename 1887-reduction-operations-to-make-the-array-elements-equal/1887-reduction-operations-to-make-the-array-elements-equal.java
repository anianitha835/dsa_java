class Solution {
    public int reductionOperations(int[] nums) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        int c=0;
        int sum=0;
        for(Map.Entry<Integer,Integer> it:hm.entrySet()){
            sum+=it.getValue()*c;
            c++;
        }
        return sum;
        }
}