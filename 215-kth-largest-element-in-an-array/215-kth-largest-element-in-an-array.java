class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        while(!q.isEmpty() && k-->1){
            q.poll();
        }
        return q.peek();
    }
}