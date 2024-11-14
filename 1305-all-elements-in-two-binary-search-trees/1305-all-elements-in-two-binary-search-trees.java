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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list=new ArrayList<>();
        get(root1,list);
        get(root2,list);
        Collections.sort(list);
        return  list;
    }
    
    private void get(TreeNode node,ArrayList<Integer> list){
        if(node==null){
            return;
        }
        
        list.add(node.val);
        get(node.left,list);
        get(node.right,list);
    }
}