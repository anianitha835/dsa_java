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
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left,root.right);
    }
    public boolean dfs(TreeNode leftNode,TreeNode rightNode){
        if(leftNode==null || rightNode==null) 
            return leftNode==rightNode;
       
        
        if(leftNode.val!=rightNode.val) return false;
            
        return dfs(leftNode.left,rightNode.right) &&
           dfs(leftNode.right,rightNode.left);
        
        
    }
}