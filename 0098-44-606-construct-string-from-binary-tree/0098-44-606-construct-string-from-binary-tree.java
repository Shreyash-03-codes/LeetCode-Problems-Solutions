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
    public String tree2str(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        
        if(root.left==null && root.right==null){
            sb.append(root.val+"");
            return sb.toString();
        }
        sb.append(root.val+"");
        if(root.left!=null){
            getStr(root.left,sb);
        }
        else{
            sb.append("()");
        }
        

        getStr(root.right,sb);
        return sb.toString();
    }

    private void getStr(TreeNode node,StringBuilder sb){
        if(node==null){
            return;
        }

        if(node.left==null && node.right==null){
            sb.append("("+node.val+")");
            return;
        }
        sb.append("(");
        sb.append(node.val+"");
        if(node.left!=null){
            getStr(node.left,sb);
        }
        else{
            sb.append("()");
        }
        getStr(node.right,sb);
        sb.append(")");
    }
}