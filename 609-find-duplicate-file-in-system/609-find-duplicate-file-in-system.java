class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res= new ArrayList<>();
        Map<String,List<String>> hm= new HashMap<>();
        for(String path:paths){
            String arr[]= path.split(" ");
          
            
        String dir= arr[0];
            
        for(int i=1;i<arr.length;i++){
            int index= arr[i].indexOf("(");
            String content= arr[i].substring(index);
            
        String fileName=dir+"/" +arr[i].substring(0,index);
            
         List<String> list= hm.getOrDefault(content,new ArrayList<>());
            list.add(fileName);
            
           hm.put(content,list);
           } 
         }
        for(String key:hm.keySet()){
            if(hm.get(key).size()>1)
                res.add(hm.get(key));
            }
        return res;
            
            
    }
}