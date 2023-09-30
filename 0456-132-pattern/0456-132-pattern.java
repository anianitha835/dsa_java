class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int secMax=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<secMax)
                return true;
            
            while(!st.isEmpty()&&nums[i]>st.peek()){
                secMax=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}