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
    public long kthLargestLevelSum(TreeNode root, int k) {
        
        ArrayList<Long> result=new ArrayList<>();
        
        BFS(root,result);
        
        if(k>result.size()){
            return -1;
        }
        result.sort(Comparator.reverseOrder()); // Sorts in reverse order
        
        return result.get(k-1);
        
    }
    
    private void BFS(TreeNode root,ArrayList<Long> list){
        
        Queue<TreeNode> queue=new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            long sum=0;
            int n=queue.size();
            
            for(int i=0;i<n;i++){
                TreeNode node=queue.poll();
                
                sum=sum+node.val;
                
                if(node.left!=null){
                    queue.add(node.left);
                }
                
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            
            list.add(sum);
        }
    }
}