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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Deque<TreeNode> que=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        que.add(root);
        boolean flag=true;
        while(!que.isEmpty()){
            int n=que.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(flag){
                    TreeNode node=que.removeFirst();
                    list.add(node.val);
                    if(node.left!=null){
                        que.addLast(node.left);
                        
                    }
                    if(node.right!=null){
                        que.addLast(node.right);
                        
                    }
                    
                }
                else{
                    
                    TreeNode node=que.removeLast();
                    list.add(node.val);
                    if(node.right!=null){
                        que.addFirst(node.right);
                        
                    }
                    if(node.left!=null){
                        que.addFirst(node.left);
                        
                    }
                }
                
            }
            result.add(list);
            flag=!flag;
        }
        return result;
    }
}