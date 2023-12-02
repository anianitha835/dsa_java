class Solution {
    public boolean check(String str, String word){
        int i=0,j=0;
        int n1=str.length();
        int n2=word.length();
        while(i<n1&&j<n2){
            if(str.charAt(i)==word.charAt(j)){
                i++;
                j++;
            }
            else
                i++;
        }
        return j==n2;
    }
    public int countCharacters(String[] words, String chars) {
        int n=words.length;
        char arr[]=chars.toCharArray();
        Arrays.sort(arr);
        String newChar=new String(arr);
        int ans=0;
        for(int i=0;i<n;i++){
            char ch[]=words[i].toCharArray();
            Arrays.sort(ch);
            String word=new String(ch);
            if(check(newChar,word))
                ans+=words[i].length();
        }
        return ans;
    }
}