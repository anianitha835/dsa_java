class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        int i=0,j=0;
         String res="";
        while(i<strs[0].length() &&j<strs[n-1].length()){
            if(strs[0].charAt(i)==strs[n-1].charAt(j)){
                res+=strs[0].charAt(i);
            i++;
            j++;
            }
            else break;
        }
        return res;
    }
}