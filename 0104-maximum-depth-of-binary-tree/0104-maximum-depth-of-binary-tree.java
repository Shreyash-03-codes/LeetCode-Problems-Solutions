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
    
    int depth=0;
    
    public int maxDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        
        checkDepth(root,1);
        return depth;
        
    }
    
    public void checkDepth(TreeNode node,int d){
        if(node==null){
            return;
        }
        
        if(d>depth){
            depth=d;
        }
        
        checkDepth(node.left,d+1);
        checkDepth(node.right,d+1);
    }
 
}