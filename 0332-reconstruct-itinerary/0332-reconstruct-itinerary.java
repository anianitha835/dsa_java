class Solution {
    List<String> ans;
    public boolean dfs(String from,List<String> res,Map<String,List<String>> adj,int n) {
        res.add(from);
        if(res.size()==n+1) {
            ans=res;
            return true;
        }
        List<String> neighbor=adj.get(from);
        for(int i=0;neighbor!=null&&i<neighbor.size();i++) {
            String to=neighbor.get(i);
            int idx=i;
            neighbor.remove(i);
            
            if(dfs(to,res,adj,n)) {
                return true;
            }
            neighbor.add(idx,to);
            
        }
        res.remove(res.size()-1);
        return false;
    }
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,List<String>> adj=new HashMap<>();
        int n=tickets.size();
        List<String> res=new ArrayList<>();
        for(List<String> li:tickets) {
            String key=li.get(0);
            String val=li.get(1);
            if(!adj.containsKey(key))
            adj.put(key,new ArrayList<>());
            
                adj.get(key).add(val);
            
        }
        
        for(List<String> li:adj.values()) 
            Collections.sort(li);
        
       
         dfs("JFK",res,adj,n);
            return ans;
        
        
    }
}