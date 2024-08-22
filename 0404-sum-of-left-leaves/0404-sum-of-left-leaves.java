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
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        return sumOfLeft(root,false);
    
    }
    
    public int sumOfLeft(TreeNode node,boolean isLeft){
        if(node.left==null && node.right==null){
            return (isLeft)?node.val:0;
        }
        
        int sum=0;
        
        if(node.left!=null){
            sum+=sumOfLeft(node.left,true);
        }
        
         if(node.right!=null){
            sum+=sumOfLeft(node.right,false);
        }
     
        return sum;
    }
}