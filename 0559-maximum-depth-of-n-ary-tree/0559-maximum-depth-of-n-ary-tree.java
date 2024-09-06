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
    
    int depth=0;
    
    public int maxDepth(Node root) {
        
        if(root==null){
            return 0;
        }
        
        checkDepth(root,1);
        return depth;
        
    }
    
       public void checkDepth(Node node,int d){
        
        if(d>depth){
            depth=d;
        }
        
        for(int i=0;i<node.children.size();i++){
            checkDepth(node.children.get(i),d+1);
        }
    }
}