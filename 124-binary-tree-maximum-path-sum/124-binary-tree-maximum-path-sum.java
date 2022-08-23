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
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        int maximum[] = new int[1];
        maximum[0] =Integer.MIN_VALUE;
        maxSum(root,maximum);
        return maximum[0];
    }
    
    public int maxSum(TreeNode root,int maximum[]){
        if(root == null) return 0;
        
        int leftSum  = Math.max(0,maxSum(root.left,maximum));
        int rightSum = Math.max(0,maxSum(root.right,maximum));
        maximum[0]  = Math.max(maximum[0], leftSum+rightSum+root.val);
        
        return root.val + Math.max(leftSum,rightSum);
    }
}