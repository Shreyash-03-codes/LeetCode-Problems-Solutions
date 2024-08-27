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
    public List<Double> averageOfLevels(TreeNode root) {
        
        if(root==null){
            return new ArrayList<>();
        }
        
        ArrayList<Double> result=new ArrayList<Double>();
        
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size=queue.size();
            double sum=0;
            
            for(int i=0;i<size;i++){
                
                TreeNode node=queue.poll();
                
                sum+=node.val;
                
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            
            double avg=sum/size;
            
            result.add(avg);
        }
        
        return result;
        
    }
}