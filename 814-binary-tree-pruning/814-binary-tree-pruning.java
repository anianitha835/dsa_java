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
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return null;
       return dfs(root)?null:root;
    }
    public boolean dfs(TreeNode root){
        if(root==null) 
            return true;
        boolean left = dfs(root.left);
        boolean right = dfs(root.right);
        if(left){
            root.left=null;
        }
        if(right){
            root.right=null;
        }
        return left && right && root.val==0;
           
        
        
        
    }
    
}