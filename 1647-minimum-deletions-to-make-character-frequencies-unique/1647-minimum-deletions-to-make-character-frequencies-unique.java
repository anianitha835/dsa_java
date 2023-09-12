class Solution {
    public int minDeletions(String s) {
        int freq[]=new int[26];
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++) {
            while(st.contains(freq[i])){
                freq[i]--;//1
                c++;//1 2
            }
            
            st.add(freq[i]);//3 2 1
            if(st.contains(0)) st.remove(0);
        }
        return c;
        
        
    }
}