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
        
       
        
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
         if(root==null){
            return result;
        }
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size=queue.size();
            
            ArrayList<Integer> list=new ArrayList<>();

            for(int i=0;i<size;++i){
                Node node=queue.poll();
                
                for(Node child:node.children){
                    queue.add(child);
                }
                list.add(node.val);

            }
             
            result.add(list);
            
        }
        
        return result;
        
    }
}