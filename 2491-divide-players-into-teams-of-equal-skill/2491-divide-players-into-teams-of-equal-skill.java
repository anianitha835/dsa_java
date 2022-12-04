class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        long ans=0;
        int i=0,j=n-1;
        long sum=skill[i]+skill[j];
        while(i<j){
            if(sum!=skill[i]+skill[j])
                return -1;
            ans+=skill[i++]*skill[j--];
            
        }
        return ans;
       
      }
}