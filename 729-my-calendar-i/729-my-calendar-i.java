class MyCalendar {
    Map<Integer,Integer> tm;

    public MyCalendar() {
        tm=new TreeMap<>();
        
    }
    
    public boolean book(int start, int end) {
        tm.put(start,tm.getOrDefault(start,0)+1);
        tm.put(end,tm.getOrDefault(end,0)-1);
        
        int sum=0;
        for(int i:tm.values()){
            sum+=i;
            if(sum>1){
                tm.put(start,tm.getOrDefault(start,0)-1);
                 tm.put(end,tm.getOrDefault(end,0)+1);
                return false;
            }
        }
            return true;
            
        
    }
}
        
        
    


/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */