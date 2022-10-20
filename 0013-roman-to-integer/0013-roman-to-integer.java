class Solution {
    public int romanToInt(String s) {
        char str[] = s.toCharArray();
       Map<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum=0;
        for(int i=0;i<str.length-1;i++){
            if(hm.get(str[i])<hm.get(str[i+1])){
                sum-=hm.get(str[i]);
            }
            else{
                sum+=hm.get(str[i]);
            }
        }
        sum+=hm.get(str[str.length-1]);
        return sum;
        
    }
}