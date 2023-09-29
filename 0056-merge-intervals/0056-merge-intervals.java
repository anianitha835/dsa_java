class Solution {
    public int[][] merge(int[][] intervals) {
       List<int[]> al=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int n=intervals.length;
        int[] p=intervals[0];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>p[1]){
                al.add(p);
                p=intervals[i];
            }
            else{
                p[1]=Math.max(p[1],intervals[i][1]);
            }
        }
        al.add(p);
        
        int s=al.size();
        int ans[][]=new int[s][2];
        for(int i=0;i<al.size();i++){
            ans[i][0]=al.get(i)[0];
            ans[i][1]=al.get(i)[1];
            
        }
        return ans;
    }
}