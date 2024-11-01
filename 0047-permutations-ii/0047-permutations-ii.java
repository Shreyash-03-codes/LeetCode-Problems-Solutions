class Solution {
    
    private void permute(int[] nums,boolean[] visited,List<List<Integer>> result,List<Integer> list,HashSet<List<Integer>> set){
        if(list.size()==nums.length){
            if(!set.contains(list)){
                result.add(new ArrayList<>(list));
                set.add(list);
            }
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                list.add(nums[i]);
                permute(nums,visited,result,list,set);;
                visited[i]=false;
                list.removeLast();
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        HashSet<List<Integer>> set=new HashSet<>();
        boolean[] visited=new boolean[nums.length];
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        permute(nums,visited,result,list,set);
        return result;
    }
}