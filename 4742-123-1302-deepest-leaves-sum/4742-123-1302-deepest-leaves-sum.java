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
    int max=Integer.MIN_VALUE;
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        getDeep(root,1);
        getDeepSum(root,1);
        return sum;
    }

    private void getDeep(TreeNode node,int level){
        if(node==null){
            return;
        }
        max=Math.max(max,level);
        getDeep(node.left,level+1);
        getDeep(node.right,level+1);
    }
    private void getDeepSum(TreeNode node,int level){
        if(node==null){
            return;
        }
        if(level==max){
            sum+=node.val;
        }
        getDeepSum(node.left,level+1);
        getDeepSum(node.right,level+1);
    }
}