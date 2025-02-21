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
    public int sumRootToLeaf(TreeNode root) {
        ArrayList<String> paths=new ArrayList<>();
        getPaths(root,"",paths);
        int sum=0;
        for(String s:paths){
            int num=0;
            int j=1;
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='1'){
                    num+=j;
                }
                j*=2;
            }
            sum+=num;
        }
        return sum;
    }

    private void getPaths(TreeNode node,String str,ArrayList<String> list){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            list.add(str+node.val);
            return;
        }
        getPaths(node.left,str+node.val,list);
        getPaths(node.right,str+node.val,list);
        
    }
}