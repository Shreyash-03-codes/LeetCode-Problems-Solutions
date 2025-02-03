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
    public void recoverTree(TreeNode root) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        preOrder(root,pq);
        inOrder(root,pq);
    }

    private void preOrder(TreeNode node,PriorityQueue<Integer> pq){
        if(node==null){
            return;
        }

        pq.add(node.val);
        preOrder(node.left,pq);
        preOrder(node.right,pq);
        
    }

    public void inOrder(TreeNode node,PriorityQueue<Integer> pq){
        if(node==null){
            return;
        }

        inOrder(node.left,pq);
        node.val=pq.remove();
        inOrder(node.right,pq);
        
    }


}