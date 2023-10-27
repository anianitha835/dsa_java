class Solution {
    public boolean isPalindrome(int i,int j,String s){
    
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            else{
                i++;
                j--;
            }
        }
        return true;
        
    }
    public String longestPalindrome(String s) {
        int maxLen=0;
        int startP=-1;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                if(isPalindrome(i,j,s)){
                    if(j-i+1>maxLen){
                        maxLen=j-i+1;
                        startP=i;
                }
                }
            }
        }
        return s.substring(startP,startP+maxLen);
    }
}