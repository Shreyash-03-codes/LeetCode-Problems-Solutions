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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        getSub(root,map);
        int max=Integer.MIN_VALUE;
        for(Integer key:map.keySet()){
            if(max<map.get(key)){
                max=map.get(key);
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)==max){
                list.add(key);
            }
        }
        int[]result=new int[list.size()];
        int i=0;
        for(Integer e:list){
            result[i++]=e;
        }
        return result;
    }

    private int getSub(TreeNode node,HashMap<Integer,Integer> map){
        if(node==null){
            return 0;
        }

        int leftSum=getSub(node.left,map);
        int rightSum=getSub(node.right,map);

        int sum=node.val+leftSum+rightSum;

        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
    }
}