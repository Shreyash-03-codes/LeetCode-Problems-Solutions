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
    public boolean isUnivalTree(TreeNode root) {
        return result(root);
    }
    
    public boolean result(TreeNode node){
        if(node==null){
            return true;
        }
        
        if(node.left==null && node.right==null){
            return true;
        }
        
        if(node.left==null && node.right!=null){
            return node.val==node.right.val && result(node.right);
        }
        
        if(node.right==null && node.left!=null){
            return node.val==node.left.val && result(node.left);
        }
        
        return (node.val==node.right.val) && (node.val==node.left.val) && result(node.right) && result(node.left);
        
    }
}