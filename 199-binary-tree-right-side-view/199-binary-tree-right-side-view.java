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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        dfs(root,0,al);
        return al;
    }
    public void dfs(TreeNode root,int level,List<Integer> ans){
        if(root==null) return;
        
        if(ans.size()== level){
            ans.add(root.val);
        }
        dfs(root.right,level+1,ans);
        dfs(root.left,level+1,ans);
        
        
    }
}