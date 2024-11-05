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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> result=new ArrayList<>();
        String str="";
        paths(root,str,result);
        return result;
    }
    
    private void paths(TreeNode node,String str,List<String> result){
        
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            str=str+node.val;
            result.add(str);
            return;
        }
        
        if(node.left!=null || node.right!=null){
            str=str+node.val+"->";
        }
        
        paths(node.left,str,result);
        paths(node.right,str,result);
     
        
    }
}