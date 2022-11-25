class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=(int)1e9+7;
        Deque<Integer> st=new ArrayDeque<>();
        long[] left=new long[n];
        long[] right=new long[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() &&arr[st.peek()]>arr[i])
                st.pop();
            left[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st=new ArrayDeque<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() &&arr[st.peek()]>=arr[i])
                st.pop();
            right[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
        }
       long res=0;
        for(int i=0;i<n;i++){
            res=(res+arr[i]*left[i]*right[i])%mod;
        }
        return (int)res;
        
    }
}