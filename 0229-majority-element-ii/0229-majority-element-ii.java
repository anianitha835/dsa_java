class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        List<Integer> li=new ArrayList<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> it:hm.entrySet()){
            if(it.getValue()>n/3)
                li.add(it.getKey());
        }
        return li;
    }
}