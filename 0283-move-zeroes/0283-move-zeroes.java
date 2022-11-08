class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        if(n==1)
            System.out.print(arr[n-1]);
        int i=0,j=0;
          while(i<n && j<n){
              if(arr[j]==0) j++;
            else{
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
            
        }
    }
