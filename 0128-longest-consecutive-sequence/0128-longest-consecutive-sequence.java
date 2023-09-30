class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n<=1)return n;
        Set<Integer> hs=new HashSet<>();
        int maxi=Integer.MIN_VALUE;
        for(int i:nums)
            hs.add(i);
        for(int i=0;i<n;i++){
            int c=1;
            int l=nums[i];
            while(hs.contains(--l)){
                c++;
                hs.remove(l);
            }
            int r=nums[i];
            while(hs.contains(++r)){
                c++;
                hs.remove(r);
            }
            maxi=Math.max(c,maxi);
        }
        return maxi;
    }
}