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
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null){
            return -1;
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        
        addSmall(root,list);
        
        for(int i=0;i<list.size();i++){
            k--;
            if(k==0){
                return list.get(i);
            }
        }
        return -1;
    }
    
    public void addSmall(TreeNode node,ArrayList<Integer> list){
        if(node==null){
            return;
        }
        
        addSmall(node.left,list);
        list.add(node.val);
        addSmall(node.right,list);
    }
}