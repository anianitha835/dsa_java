class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        boolean[] taken=new boolean[26];//b c
        int l_idx[]=new int[26];
        for(int i=0;i<n;i++){
            l_idx[s.charAt(i)-'a']=i;
         }
        StringBuilder ans=new StringBuilder();//acdb
        for(int i=0;i<n;i++){//a
            char ch=s.charAt(i);
            if(taken[ch-'a']==true)continue;
        
                    while(ans.length()>0 &&ch<ans.charAt(ans.length()-1)&&l_idx[(ans.charAt(ans.length()-1))-'a']>i){
                       
                         taken[ans.charAt(ans.length()-1)-'a']=false;
                         ans.deleteCharAt(ans.length()-1);
                    }
            ans.append(ch);
            taken[ch-'a']=true;
                    
                }
        return ans.toString();
            }
        }
    
