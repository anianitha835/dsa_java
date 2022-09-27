class Solution {
    public String pushDominoes(String dominoes) {
        int[] right=new int[dominoes.length()];
        int[] left=new int[dominoes.length()];
        
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<dominoes.length();i++){
            if(dominoes.charAt(i)=='.' && (dominoes.charAt(i-1)=='R' || right[i-1]>0)){
                right[i]=right[i-1]+1;
            }
        }
        for(int i=dominoes.length()-2;i>=0;i--){
            if(dominoes.charAt(i)=='.' && (dominoes.charAt(i+1)=='L'||left[i+1]>0)){
                left[i]=left[i+1]+1;
            }
        }
       
        for(int i=0;i<dominoes.length();i++){
            if(right[i]==left[i]){
                sb.append(dominoes.charAt(i));
            } 
            else if(left[i]==0 || right[i]==0){
                if(right[i]==0) sb.append('L');
                else sb.append('R');
            }
            else{
                if(left[i]>right[i]) sb.append('R');
               else sb.append('L');
            }
        }
        return sb.toString();
    }
}