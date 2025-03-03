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
    public TreeNode deleteNode(TreeNode root, int key) {
        ArrayList<TreeNode> list=new ArrayList<>();
        getNodes(root,list,key);
        root=setNodes(list,0,list.size()-1);
        return root;
    }

    private TreeNode setNodes(ArrayList<TreeNode> list,int start,int last){
        if(start<=last){
            int mid=(start+last)/2;

            TreeNode node=list.get(mid);

            node.left=setNodes(list,start,mid-1);
            node.right=setNodes(list,mid+1,last);

            return node;
            
        }

        return null;
    }

    private void getNodes(TreeNode node,ArrayList<TreeNode> list,int target){
        if(node==null){
            return;
        }

        getNodes(node.left,list,target);
        if(target!=node.val){
            list.add(node);
        }

        getNodes(node.right,list,target);

        node.left=null;
        node.right=null;
    }
}