class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        char arr[]=s.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i]=='(' ||arr[i]=='[' ||arr[i]=='{')
                st.push(arr[i]);
            
            if(arr[i]==')'){
                if(st.isEmpty()||st.peek()!='(')
                    return false;
                else if(!st.isEmpty())
                    st.pop();
            }
            if(arr[i]=='}'){
                if(st.isEmpty()||st.peek()!='{')
                    return false;
                else if(!st.isEmpty())
                    st.pop();
            }
            if(arr[i]==']'){
                if(st.isEmpty()||st.peek()!='[')
                    return false;
                else if(!st.isEmpty())
                    st.pop();
            }
            
            
        }
        return st.isEmpty();
    }
}