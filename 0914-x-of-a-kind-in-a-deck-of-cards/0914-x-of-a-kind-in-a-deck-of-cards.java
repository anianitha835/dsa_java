class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<=1) return false;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:deck){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        int mini=Integer.MAX_VALUE;;
        for(int it:hm.values()){
            if(mini>it)
                mini=it;
        }
            
        for(int i=2;i<=mini;i++){
            boolean flag=true;
        for(int it:hm.values()){
            if(it%i!=0)
                flag=false;
                
        }
            if(flag)return true;
            
        }
        return false;
    }
}