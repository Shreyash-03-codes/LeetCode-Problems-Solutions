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
    public List<Integer> preorder(Node root) {
        
     
        
        ArrayList<Integer> list=new ArrayList<>();
        
       if(root==null){
            return list;
        }
        
        list.add(root.val);
        
        preTraverse(root,list);
        
        return list;
    }
    
    public void preTraverse(Node node,ArrayList<Integer> list){
        for(Node child:node.children){
            list.add(child.val);
            preTraverse(child,list);
        }
    }
}