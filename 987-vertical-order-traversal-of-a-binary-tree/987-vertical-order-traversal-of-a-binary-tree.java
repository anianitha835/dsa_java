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
class Tuple{
    int row;
    int col;
    TreeNode node;
    public Tuple(int col,int row,TreeNode node){
        this.row=row;
        this.col=col;
        this.node=node;
        
    }
    
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.add(new Tuple(0,0,root));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.col;
            int y= tuple.row;
            
            if(!map.containsKey(x)){
                map.put(x, new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<Integer>());
                
            }
            map.get(x).get(y).add(node.val);
        
        if(node.left!=null) {
            q.add(new Tuple(x-1,y+1,node.left));
        }
        if(node.right!=null){
            q.add(new Tuple(x+1,y+1,node.right));
        }
        
     }
        List<List<Integer>> ans= new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> val: map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:val.values()){
                while(!nodes.isEmpty()){
                    //System.out.println(nodes.peek());
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
}
}
