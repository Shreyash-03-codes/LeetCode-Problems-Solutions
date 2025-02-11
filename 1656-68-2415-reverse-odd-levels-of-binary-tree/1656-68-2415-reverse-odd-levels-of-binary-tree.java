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
    public TreeNode reverseOddLevels(TreeNode root) {
        
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        int level=0;
        while(!que.isEmpty()){
            int n=que.size();
            ArrayList<Integer> list=new ArrayList<>();
            ArrayList<TreeNode> nodes=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=que.remove();
                list.add(node.val);
                nodes.add(node);
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
                
            }

            if(level%2==1){
                int j=list.size()-1;
                for(TreeNode node:nodes){
                    node.val=list.get(j);
                    j--;
                }
            }
            level++;
        }
        return root;
    }
}