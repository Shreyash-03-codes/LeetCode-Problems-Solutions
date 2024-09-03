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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        ArrayList<List<Integer>> result=new ArrayList<>();
        
        if(root==null){
            return result;
        }
        
        Deque<TreeNode> queue=new ArrayDeque<>();
        
        queue.offer(root);
        
        boolean reverse=false;
        
        while(!queue.isEmpty()){
            
            ArrayList<Integer> list=new ArrayList<>();
            
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                
                if(!reverse){
                    TreeNode node=queue.pollFirst();
                    if(node.left!=null){
                        queue.addLast(node.left);
                    }
                    if(node.right!=null){
                        queue.addLast(node.right);
                    }
                    
                    list.add(node.val);
                    
                }
                else{
                    
                    TreeNode node=queue.pollLast();
                    
                    if(node.right!=null){
                        queue.addFirst(node.right);
                    }
                    if(node.left!=null){
                        queue.addFirst(node.left);
                    }
                    
                    list.add(node.val);
                    
                }
                
            }
            
            result.add(list);
            
            reverse=!reverse;
            
        }
        return result;
    }
}