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
    public List<Integer> rightSideView(TreeNode root) {

        if(root==null){
            return new ArrayList<>();
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int n=queue.size();
            ArrayList<Integer> curr=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=queue.remove();
                curr.add(node.val);


                if(node.left!=null){
                    queue.add(node.left);
                }

                if(node.right!=null){
                    queue.add(node.right);
                }  
            }

            list.add(curr.get(curr.size()-1));
        }
        return list;
    }
}