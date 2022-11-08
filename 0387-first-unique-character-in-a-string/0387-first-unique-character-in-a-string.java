class Solution {
    public int firstUniqChar(String s) {
        int ans=-1;
        Map<Character,Integer> hm = new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))<=1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}