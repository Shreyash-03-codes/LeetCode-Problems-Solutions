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
    public boolean isValidBST(TreeNode root) {
        
      ArrayList<Integer> list=new ArrayList<>();   
      valid(root,list);
        
        if(list.size()==1){
            return true;
        }
        
        if(list.size()<3){
            if(list.get(0)<list.get(1)){
                return true;
            }
            else{
                return false;
            }
        }
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1)<list.get(i) && list.get(i)<list.get(i+1)){
                continue;
            }else{
                return false;
            }
        }
        return true;
          
    }
    
    private void valid(TreeNode node,ArrayList<Integer> list){
        
        if(node==null){
            return;
        }
        
        valid(node.left,list);
        list.add(node.val);
        valid(node.right,list);
        
    }
}
