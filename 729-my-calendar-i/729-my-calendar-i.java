class Pair{
    int st;
    int en;
    public Pair(int start,int end){
        this.st=start;
        this.en=end;
        
    }
}
class MyCalendar {
    ArrayList<Pair> al;

    public MyCalendar() {
       al=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(Pair i:al){
          if(start<i.en && end>i.st) return false;
            
            
        }
        al.add(new Pair(start,end));
      return true;
        
    }
}
        
        
    


/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */