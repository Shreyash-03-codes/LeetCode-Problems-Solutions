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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root,list);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            min=Math.min(min,Math.abs(list.get(i)-list.get(i+1)));
        }
        return min;
    }

    private void inOrder(TreeNode node,ArrayList<Integer> list){
        if(node==null){
            return;
        }

        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);
    }
}