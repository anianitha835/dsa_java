class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
         List<List<Integer>> ans= new ArrayList<>();
         HashMap<String,Integer> hm = new HashMap<>();
        Set<Integer> set=new TreeSet<>();
        int n=words.length;
        //add elements into hashmap
        for(int i=0;i<n;i++){
            hm.put(words[i], i);
            set.add(words[i].length());
        }
        for(int i=0;i<n;i++){
            int length=words[i].length();
            
            if(length==1){
                if(hm.containsKey("")){
                    ans.add(Arrays.asList(i,hm.get("")));
                    ans.add(Arrays.asList(hm.get(""),i));
                }
                continue;
            }
            String reverse=new StringBuilder(words[i]).reverse().toString();
            if(hm.containsKey(reverse) && hm.get(reverse)!=i){
                 ans.add(Arrays.asList(i,hm.get(reverse)));
            }
            
            for(int k:set){
                if(k==length)
                    break;
                
                if(isPalindrome(reverse,0,length-1-k)){
                    String s1=reverse.substring(length-k);
                    if(hm.containsKey(s1)){
                       ans.add(Arrays.asList(i,hm.get(s1)));
                    }
                }
                if(isPalindrome(reverse,k,length-1)){
                    String s2=reverse.substring(0,k);
                    if(hm.containsKey(s2)){
                       ans.add(Arrays.asList(hm.get(s2),i));
                    }
                }
                
                
            }
        }
        return ans;
        
     }
    public boolean isPalindrome(String s,int i,int j){
       while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
    
   