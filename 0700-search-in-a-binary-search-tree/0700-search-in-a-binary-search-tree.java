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

    TreeNode target=null;
    public TreeNode searchBST(TreeNode root, int val) {

        search(root,val);
        return target;      

    }

    public void search(TreeNode root,int val){

         
       if(root==null){
            return;
       }
        if(root.val==val){
            target=root;
            return;
        }
        if(val<root.val){
            searchBST(root.left,val);
        }
        else if(val>root.val){
            searchBST(root.right,val);
        }

    }
}