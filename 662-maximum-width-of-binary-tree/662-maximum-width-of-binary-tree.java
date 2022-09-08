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
class Pair{
    int id;
    TreeNode node;
    public Pair(TreeNode node,int id){
        this.node=node;
        this.id=id;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        int min = q.peek().id;
        int first=0,last=0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){
                TreeNode curr =q.peek().node;
                int curr_id=q.peek().id - min;
                q.poll();
                if(i==0) first=curr_id;
                if(i==(len-1)) last= curr_id;
                
                if(curr.left!=null) q.offer(new Pair(curr.left, (2*curr_id)+1));
                if(curr.right!=null) q.offer(new Pair(curr.right, (2*curr_id)+2));
                
                
            }
            ans=Math.max(ans,last - first +1);
            
        }
        return ans;
    }
    
}