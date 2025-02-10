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
   int i=0;
    public TreeNode convertBST(TreeNode root) {

        ArrayList<Integer> list=new ArrayList<>();
        
        inOrder(root,list);
        
        for(int i=list.size()-2;i>=0;i--){
            list.set(i,list.get(i+1)+list.get(i));
        }

        setInOrder(root,list);
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

    private void setInOrder(TreeNode node,ArrayList<Integer> list){
        if(node==null){
            return;
        }

        setInOrder(node.left,list);
        node.val=list.get(i);
        i++;
        setInOrder(node.right,list);
    }
}