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
    public int findBottomLeftValue(TreeNode root) {
        

        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=queue.remove();

                l.add(node.val);

                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                
            }
            list.add(l);
        }
        int n=list.size();
        int e=list.get(n-1).get(0);
        return e;
    }
}