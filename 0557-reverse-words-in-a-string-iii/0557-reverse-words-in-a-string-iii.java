class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i)); 
            }
            else{
                
                sb.reverse();
                //System.out.println(sb.toString());
                ans.append(sb.toString());
                ans.append(" ");
                sb.setLength(0);
            }
            
        }
        ans.append(sb.reverse().toString());
        return ans.toString();
    }
}