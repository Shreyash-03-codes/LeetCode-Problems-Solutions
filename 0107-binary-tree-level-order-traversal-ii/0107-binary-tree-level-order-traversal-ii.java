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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        if(root==null){
            return new ArrayList<>();
        }
        
        ArrayList<List<Integer>> result=new ArrayList<>();
        
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            ArrayList<Integer> list=new ArrayList<>();
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                
                TreeNode node=queue.poll();
                
                list.add(node.val);
                
                if(node.left!=null){
                    queue.add(node.left);
                }
                
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            result.addFirst(list);
        }
        
        return result;
        
    }
}