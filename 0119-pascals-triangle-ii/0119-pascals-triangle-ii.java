class Solution {
    public List<Integer> getRow(int row) {
        int arr[][]=new int[row+1][row+1];
        for(int r[]:arr)
            Arrays.fill(r,1);
        
        for(int i=1;i<row+1;i++){
            for(int j=1;j<=i-1;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
       
        
        List<Integer> li=new ArrayList<>();
            for(int j=0;j<=row;j++){
                
                li.add(arr[row][j]);
            }
        return li;
        }
    
}