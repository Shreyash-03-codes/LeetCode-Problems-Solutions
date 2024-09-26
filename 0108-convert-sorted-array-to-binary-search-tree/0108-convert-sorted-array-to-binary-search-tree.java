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

     TreeNode root=null;
    public TreeNode sortedArrayToBST(int[] nums) {

       populate(nums);

       return root;
        
    }

    public void insert(int val){

        if(root==null){
            root=new TreeNode(val);
        }
        else{
            insert(root,val);
        }

    }

    public TreeNode insert(TreeNode node,int val){

        if(node==null){
            return new TreeNode(val);
        }

        if(val<node.val){
            node.left=insert(node.left,val);
        }
        if(val>node.val){
            node.right=insert(node.right,val);
        }
        return node;

    }

    public void populate(int[] nums){

        populate(nums,0,nums.length);

    }

    public void populate(int[]nums,int start,int last){

        if(start>=last){
            return;
        }

        int mid=(start+last)/2;

        insert(nums[mid]);

        populate(nums,start,mid);
        populate(nums,mid+1,last);

    }
}