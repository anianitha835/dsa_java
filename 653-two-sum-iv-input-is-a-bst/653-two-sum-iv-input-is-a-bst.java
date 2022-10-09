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
      List<Integer> al =  new ArrayList<Integer>();
    public boolean findTarget(TreeNode root, int k) {
           Inorder(root);
           int low=0;
           int high=al.size()-1;
        while(low<high){
            if(al.get(low)+al.get(high)==k) return true;
            else if(al.get(low)+al.get(high)<k) low++;
            else high--;
        }
        return false;
    }

      public void Inorder(TreeNode root){
            if(root==null) return;
             
            Inorder(root.left);
            al.add(root.val);
            Inorder(root.right);
            
        }
    }
