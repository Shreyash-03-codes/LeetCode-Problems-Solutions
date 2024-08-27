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

    int c=0;

    public int countNodes(TreeNode root) {

        countNode(root);

        return c;
        
    }

    public void countNode(TreeNode node){

        if(node==null){
            return;
        }

        c=c+1;
        countNode(node.left);
        countNode(node.right);
        
    }
}