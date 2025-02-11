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
    public boolean isEvenOddTree(TreeNode root) {
        
        Queue<TreeNode> que=new LinkedList<>();

        que.add(root);
        int i=0;

        while(!que.isEmpty()){
            int n=que.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                TreeNode node=que.remove();
                list.add(node.val);
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
                
            }

            if(i%2==0){
                int last=-1;
                for(int a:list){
                    if(a%2==0 || last>=a){
                        return false;
                    }
                    last=a;
                }
            }
            else{
                int last=Integer.MAX_VALUE;
                for(int a:list){
                    if(a%2==1 || last<=a){
                        return false;
                    }
                    last=a;
                }
            }
            i++;

        }
        return true;
    }
}