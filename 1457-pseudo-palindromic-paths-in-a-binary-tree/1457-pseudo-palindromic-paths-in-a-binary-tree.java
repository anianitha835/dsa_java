/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] freq=new int[10];
        dfs(root,freq);
        return count;
        
        
    }
    public void dfs(TreeNode root,int freq[]){
        if(root==null) return;
        if(root.left==null &&root.right==null){
            freq[root.val]++;
            if(isPal(freq)) count++;
            
            freq[root.val]--;
            return;
        }
        
        
        freq[root.val]++;
        dfs(root.left,freq);
        dfs(root.right,freq);
        
        freq[root.val]--;
    }
    public boolean isPal(int freq[]){
        int odd=0;
        for(int i:freq){
            if((i&1)==1){
                odd++;
            }
            if(odd>1) return false;
            
        }
        return true;
    }
}