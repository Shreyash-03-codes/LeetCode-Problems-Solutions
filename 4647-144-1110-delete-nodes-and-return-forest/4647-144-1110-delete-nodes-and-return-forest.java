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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int e:to_delete){
            set.add(e);
        }

        

        getNodes(root,set,list,null);
        if(!set.contains(root.val)){
            list.add(root);
        }
        return list;
    }

    private void getNodes(TreeNode node,HashSet<Integer> set,List<TreeNode> list,TreeNode parent){
        if(node==null){
            return;
        }

        getNodes(node.left,set,list,node);
        getNodes(node.right,set,list,node);

        if(set.contains(node.val)){

            if(parent!=null && parent.left==node){
                parent.left=null;
            }

            if(parent!=null && parent.right==node){
                parent.right=null;
            }

            if(node.left!=null  ){
            
            list.add(node.left);

            
            }

            if(node.right!=null){
                list.add(node.right);
            }
            node.left=null;
            node.right=null;
        }


        
    }
}