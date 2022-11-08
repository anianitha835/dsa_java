class Solution {
    public boolean isAnagram(String s, String t) {
       /* int l1=s.length();
        int l2=t.length();
        if(l1!=l2) return false;
        int[] freq=new int[26];
        for(int i=0;i<l1;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0) return false;
        }
        return true;
    }*/
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(new String(ch1).equals(new String(ch2))) return true;
        return false;
        
    }  
}