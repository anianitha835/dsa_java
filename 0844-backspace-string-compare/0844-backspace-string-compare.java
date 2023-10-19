class Solution {
    public boolean backspaceCompare(String s, String t) {
        List<Character> l1=new ArrayList<>();
        List<Character> l2=new ArrayList<>();
        
        int n1=s.length();
         int n2=t.length();
        
        for(int i=0;i<n1;i++){  //a##c
            if(s.charAt(i)=='#' &&l1.size()>0){
                l1.remove(l1.size()-1);
            }
            else if(s.charAt(i)!='#')
                l1.add(s.charAt(i)); //[c]
        }
        
        for(int i=0;i<n2;i++){//"xywrrmu#p"
            
            if(t.charAt(i)=='#' &&l2.size()>0){
                l2.remove(l2.size()-1);
            }
            else if(t.charAt(i)!='#')                
                
                l2.add(t.charAt(i));//
        }
        
        if(l1.size()!=l2.size())return false;
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)!=l2.get(i))return false;
        }
        return true;
        
        
        
    }
}