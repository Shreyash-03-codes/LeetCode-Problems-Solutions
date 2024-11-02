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
    
    private void sum(TreeNode node,int target,List<List<Integer>> result,List<Integer> list){
        
        if(node==null){
         
            return;
        }
        
        
        list.add(node.val);
        
        if(node.left==null && node.right==null){
             if(node.val==target){
                result.add(new ArrayList<>(list));
            }
          
        }
        else{
        sum(node.left,target-node.val,result,list);
        
        sum(node.right,target-node.val,result,list);
        }
        list.removeLast();
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        sum(root,targetSum,result,list);
        return result;
    }
}