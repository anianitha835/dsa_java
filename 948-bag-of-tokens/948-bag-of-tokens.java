class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int score=0;
        while(i<=j){
            if(tokens[i]<=power){
                power-=tokens[i];
                score++;
                i++;
            }
            else{
                if(score>0 &&i!=j){
                    power+=tokens[j];
                    score--;
                }
                j--;
            }
        }
        return score>0?score:0;
    }
}