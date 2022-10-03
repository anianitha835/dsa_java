class Solution {
    public int minCost(String s, int[] neededTime) {
        int n=neededTime.length;
        int sum=0;
        int i=0;
        int j=i+1;
        int first,second;
        while(i<n-1 &&j<n){
            if(s.charAt(i)==s.charAt(j)){
                   first = neededTime[i];
                   second=neededTime[j];
                
                if(first<=second){
                    sum+=first;
                    j++;
                    i=j-1;
                }
                else{
                    sum+=second;
                    j++;
                }
               
            }
             else{
            j++;
            i=j-1;
             }
        }
        return sum;
            
        }
        
    }
