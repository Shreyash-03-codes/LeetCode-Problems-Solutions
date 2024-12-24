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
    public TreeNode increasingBST(TreeNode root) {
        
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root,list);
        TreeNode node=root;
        node.val=(list.remove(0));
        for(Integer e:list){
            if(node.right!=null){
                node.right.val=e;
                node.left=null;
                node=node.right;
                
            }
            
            else if(node.right==null){
                node.right=new TreeNode(e);
                node.left=null;
                node=node.right;
            }
        }
        return root;
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