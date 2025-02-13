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
    public boolean findTarget(TreeNode root, int k) {
        
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root,list);
        int start=0;
        int last=list.size()-1;

        while(start<last){
            int sum=list.get(start)+list.get(last);

            if(sum==k){
                return true;
            }
            else if(sum<k){
                start++;
            }
            else{
                last--;
            }
        }
        return false;
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