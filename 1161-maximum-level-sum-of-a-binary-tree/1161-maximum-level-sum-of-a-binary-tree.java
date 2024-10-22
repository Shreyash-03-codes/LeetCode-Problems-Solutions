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
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> queue=new LinkedList<>();
        
        queue.add(root);
        
        int max=Integer.MIN_VALUE;
        
        int curLevel=0;
        int maxLevel=0;
        
        while(!queue.isEmpty()){
            
            int n=queue.size();
            int sum=0;
            curLevel++;
            
            for(int i=0;i<n;i++){
                TreeNode node=queue.remove();
                
                sum+=node.val;
                
                if(node.left!=null){
                    queue.add(node.left);
                }
                
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            
            if(sum>max){
                max=sum;
                maxLevel=curLevel;
            }
        }
        return maxLevel;
    }
}