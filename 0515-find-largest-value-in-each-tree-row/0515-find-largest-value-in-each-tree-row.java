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
    public List<Integer> largestValues(TreeNode root) {
        
        if(root==null){
            return new ArrayList<>();
        }
        
        ArrayList<Integer> result=new ArrayList<Integer>();
        
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int large=Integer.MIN_VALUE;
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                
                TreeNode node=queue.poll();
                
                if(large<node.val){
                    large=node.val;
                }
                
                if(node.left!=null){
                    queue.add(node.left);
                }
                
                if(node.right!=null){
                    queue.add(node.right);
                }
                
            }
            result.add(large);
        }
        
        return result;
        
    }
}