class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        Set<Integer> hs=new TreeSet<>();
        
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int k=hs.size();
        int idx=0;
        for(int i:hs) {
            nums[idx++]=i;
        }
        return k;
    }
}