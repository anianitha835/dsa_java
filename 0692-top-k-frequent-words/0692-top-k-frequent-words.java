class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> tm= new TreeMap<>();
        List<String> al= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            tm.put(words[i],tm.getOrDefault(words[i],0)+1);
        }
        while(k-->0){
            int maxi=Integer.MIN_VALUE;
            String ans="";
            for(Map.Entry<String,Integer> entry: tm.entrySet()){
                if(entry.getValue()>maxi){
                    maxi=entry.getValue();
                    ans= entry.getKey();
                }
                
            }
            al.add(ans);
            tm.remove(ans);
            
        }
        return al;
        
    }
}