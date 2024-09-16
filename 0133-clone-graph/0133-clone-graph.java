/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        
        if(node==null){
            return null;
        }
        
    
        
        Queue<Node> queue=new LinkedList<>();
        
        HashMap<Node,Node> map=new HashMap<>();
 
        
        queue.add(node);
        map.put(node,new Node(node.val,new ArrayList<>()));
        
        while(!queue.isEmpty()){
            
            Node n=queue.remove();
           for(Node ne:n.neighbors){
            if(!map.containsKey(ne)){
                map.put(ne,new Node(ne.val,new ArrayList<>()));
                queue.add(ne);
            }
               map.get(n).neighbors.add(map.get(ne));
           }
                
            }
        
        
        return map.get(node);
    }
}