class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Queue<int[]> q=new PriorityQueue<>((a,b)->b[0]-a[0]);
        int arr[]=new int[k];
        for(int i=0;i<nums.length;i++){
            q.add(new int[]{nums[i],i});
        }
        int j=0;
        while(!q.isEmpty() &&j<k){
            int[] p=q.poll();
            arr[j++]=p[1];
        }
       Arrays.sort(arr);
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=nums[arr[i]];
        }
        return res;
    }
}