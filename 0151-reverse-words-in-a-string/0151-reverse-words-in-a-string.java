class Solution {
    public String reverseWords(String s) {
        List<String> al=new ArrayList<>();
        int n=s.length();
        char arr[]=s.toCharArray();
        int i=0;
        while(i<n){//the sky is blue
            String str="";
            //System.out.println(str);
            while(i<n&& arr[i]!=' '){
                str+=arr[i];//the
                i++;
            }
            if(!str.isEmpty())
                al.add(str);
            //System.out.println(al);
            while(i<n && arr[i]==' ')
            i++;
        }
        int size=al.size();
        String ans="";
        for(int j=size-1;j>=0;j--){
            ans+=al.get(j);
            if(j>0)
                ans+=" ";
        }
        return ans;
    }
}