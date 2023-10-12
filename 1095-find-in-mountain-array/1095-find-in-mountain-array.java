/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findPeak(MountainArray mr){
        int l=1;
        int r=mr.length()-1;
        while(l<r){
            int m=l+(r-l)/2;
            
            if(mr.get(m)<mr.get(m+1))
                l=m+1;
            else
                r=m;
           }
        return l;
    }
    
        public int searchLeft(int l,int r,int tar,MountainArray mr){
            while(l<=r){
            int m=l+(r-l)/2;
            if(mr.get(m)==tar)
                return m;
            
            else if(mr.get(m)>tar)
                r=m-1;
            else 
                l=m+1;
                
                
            }
            return -1;
        }
            
        
           public int searchRight(int l,int r,int tar,MountainArray mr){
            while(l<=r){
            int m=l+(r-l)/2;
            if(mr.get(m)==tar)
                return m;
            
            else if(mr.get(m)>tar)
                l=m+1;
                
            else 
                r=m-1;
                
         }
            return -1; 
           }  
            
            
       
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeak(mountainArr);
        int ind=-1;
        ind=searchLeft(0,peak,target,mountainArr);
        if(ind!=-1)return ind;
        ind=searchRight(peak+1,mountainArr.length()-1,target,mountainArr);
        return ind;
    }
}