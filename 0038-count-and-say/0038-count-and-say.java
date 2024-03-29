class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=2;i<=n;i++){
            s=helper(s);
        }
        return s;
        
    }
    private String helper(String str){
        StringBuilder sb = new StringBuilder();
        char ch = str.charAt(0);
        int count=1;
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
            else{
                sb.append(count);
                sb.append(ch);
                ch=str.charAt(i);
                count=1;
             }
        }
        sb.append(count);
        sb.append(ch);
        return sb.toString();
        
    }
}