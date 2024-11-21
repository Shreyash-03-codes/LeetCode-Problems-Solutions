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
    
    private void sum(TreeNode node,String str,ArrayList<String> list){
        if(node.left==null && node.right==null){
            
            list.add(str+node.val);
            return;
        }
        
        if(node.left!=null){
            sum(node.left,str+node.val,list);
        }
        
        if(node.right!=null){
            sum(node.right,str+node.val,list);
        }
        
    }
    public int sumNumbers(TreeNode root) {
        
        ArrayList<String> list=new ArrayList<>();
        sum(root,"",list);
        
        int sum=0;
        
        for(String s:list){
            int num=Integer.parseInt(s);
            sum+=num;
        }
        return sum;
    }
}