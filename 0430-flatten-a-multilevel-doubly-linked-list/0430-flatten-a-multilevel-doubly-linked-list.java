/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        ArrayList<Integer> list=new ArrayList<>();
        getList(head,list);
        
        head=null;
        Node temp=null;
        
        for(Integer e:list){
            Node node=new Node(e);
            if(head==null){
                head=node;
                temp=head;
            }
            else{
                
                temp.next=node;
                node.prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
    
    private void getList(Node node,ArrayList<Integer> list) {
        while(node!=null){
            Node temp=node;
          
                list.add(temp.val);
                if(temp.child!=null){
                    getList(temp.child,list);
                }
                
            
            node=node.next;
        }
    }
}