/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i=0;i<len;i++){
                al.add(q.peek().val);
                for(Node n:q.peek().children){
                    q.add(n);
                }
                q.poll();
            }
            ans.add(al);
        }
        return ans;
    }
}