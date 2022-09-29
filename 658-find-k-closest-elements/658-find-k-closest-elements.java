class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> al=new ArrayList<Integer>(k);
        int i=0,j=arr.length-1;
        while(j-i>=k){
          
            if(Math.abs(arr[i]-x)<=Math.abs(x-arr[j])){
                j--;
            }
           
            else{
                i++;
              }
            }
           
        for(int ind=i;ind<=j;ind++){
            al.add(arr[ind]);
                }
           return al;
    }
}