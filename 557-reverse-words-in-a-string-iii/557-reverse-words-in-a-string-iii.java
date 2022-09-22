class Solution {
    public String reverseWords(String s) {
        char words[]=s.toCharArray();
        int start=0;
        for(int end=0;end<=words.length;end++){
            if(end==words.length||words[end]==' '){
                reverseStr(words,start,end-1);
                start=end+1;
            }
        }
        return new String(words);
    }
    
    public void reverseStr(char words[],int start,int end){
        while(start<end){
            char temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        
    }
}