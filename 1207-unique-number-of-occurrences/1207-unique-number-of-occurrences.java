class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hm=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i:hm.values()){
            if(set.contains(i)) return false;
            set.add(i);
        }
        return true;
    }
}