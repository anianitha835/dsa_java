class Solution {
    
    public boolean exist(char[][] board, String word) {
        int r= board.length;
        int c= board[0].length;
        //int start=0;
        char vis[][] =new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0) &&dfs(i,j,word,board,0,vis)){
                    return true;
                }
            }
        }
        return false;
        
    }
    boolean dfs(int i,int j,String str, char[][]grid,int start,char[][]vis){
        if(str.length()==start)
        {
            return true;
        }
        if(i<0 ||i>=grid.length ||j<0 ||j>=grid[0].length || vis[i][j]=='#')
        {
            return false;
        }
        
        
           if(grid[i][j]==str.charAt(start)){
               char ch= vis[i][j];
               vis[i][j]='#';
             boolean res=dfs(i+1,j,str,grid,start+1,vis) ||
             dfs(i,j+1,str,grid,start+1,vis)||
             dfs(i-1,j,str,grid,start+1,vis)||
             dfs(i,j-1,str,grid,start+1,vis);
               
               vis[i][j]=ch;
               return res;
             
        }
        return false;
    }
}