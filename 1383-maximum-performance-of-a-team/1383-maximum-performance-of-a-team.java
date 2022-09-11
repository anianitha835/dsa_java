class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        long mod=(int)1000000007;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=efficiency[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr,(a,b)->(b[0]-a[0]));
        long totalSpeed=0;
        long maxPerformance=0;
        Queue<Integer> q= new PriorityQueue<>(k);
        for(int i=0;i<n;i++){
            if(q.size()>=k){
                totalSpeed-=q.poll();
            }
            q.offer(arr[i][1]);
            totalSpeed+=arr[i][1];
            maxPerformance=Math.max(maxPerformance,totalSpeed*arr[i][0]);
            
        }
        return (int)(maxPerformance%mod);
    }
}