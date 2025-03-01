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
    public TreeNode balanceBST(TreeNode root) {
        
        ArrayList<TreeNode> list=new ArrayList<>();
        inOrder(root,list);
        root=populate(list,0,list.size()-1);
        return root;
    }

    private TreeNode populate(ArrayList<TreeNode> list,int start,int last){
        if(start<=last){
            int mid=start+(last-start)/2;
            TreeNode node=list.get(mid);
            node.left=populate(list,start,mid-1);
            node.right=populate(list,mid+1,last);
            return node;
            
        }
        return null;
    }

    private void inOrder(TreeNode node,ArrayList<TreeNode> list){
        if(node==null){
            return;
        }
        inOrder(node.left,list);
        list.add(node);
        inOrder(node.right,list);
    }
}