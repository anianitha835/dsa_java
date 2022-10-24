class Solution {
    public int maxLength(List<String> arr) {
        return helper(arr,0,"");
        
    }
    private int helper(List<String> arr, int i,String soFar){
        if(i==arr.size()){
            if(isValid(soFar)){
                return soFar.length();
            }
            return 0;
        }
        int l1=helper(arr,i+1,soFar);
        int l2=helper(arr,i+1,soFar+arr.get(i));
        return Math.max(l1,l2);
    }
    private boolean isValid(String s){
        int map[] = new int[26];
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'a';
            map[val]++;
           if(map[val]>1){
               return false;
           }
    }
        return true;
}
}