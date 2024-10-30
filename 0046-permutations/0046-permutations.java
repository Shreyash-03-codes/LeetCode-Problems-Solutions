class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        permute(nums,result,list,visited);
        return result;
     
    }
    
    private void permute(int[] nums,List<List<Integer>> result,List<Integer> list,boolean[] visited){
        
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
        }
        
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                list.add(nums[i]);
                permute(nums,result,list,visited);
                visited[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}