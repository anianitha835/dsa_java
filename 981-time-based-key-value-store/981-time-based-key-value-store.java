class TimeMap {
     Map<String,TreeMap<Integer,String>> hm;
    public TimeMap() {
        hm=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
             hm.put(key,new TreeMap<Integer,String>());
        }
            hm.get(key).put(timestamp,value);
        }
       
    
    public String get(String key, int timestamp) {
        if(hm.containsKey(key)){
            Integer k=hm.get(key).floorKey(timestamp);
        
        if(k!=null)
            return hm.get(key).get(k);
        }
        
    return "";
        
    }
    }


/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */