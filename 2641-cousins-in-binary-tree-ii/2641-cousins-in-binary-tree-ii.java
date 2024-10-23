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
    public TreeNode replaceValueInTree(TreeNode root) {
        
        Queue<TreeNode> queue=new LinkedList<>();
        
        ArrayList<Integer> levelSum=new ArrayList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int n=queue.size();
            int sum=0;
            
            for(int i=0;i<n;i++){
                
                TreeNode node=queue.remove();
                sum+=node.val;
                if(node.left!=null){
                    queue.add(node.left);
                }
                
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            
            levelSum.add(sum);
        }
        
        root.val=0;
        int level=0;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int n=queue.size();
            
            
            for(int i=0;i<n;i++){
                int sum=0;
                TreeNode node=queue.remove();
                
                
                if(node.left!=null){
                    sum+=node.left.val;
                }
                
                if(node.right!=null){
                    sum+=node.right.val;
                }
                
                if(node.left!=null){
                    node.left.val=levelSum.get(level+1)-sum;
                    queue.add(node.left);
                }
                
                if(node.right!=null){
                    node.right.val=levelSum.get(level+1)-sum;
                    queue.add(node.right);
                }
                
            }
            level++;
        }
        return root;
    }
}