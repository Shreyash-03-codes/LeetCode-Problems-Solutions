class Solution {
    public String getPermutation(int n, int k) {
     
        int[] nums=new int[n];
        int i=0;

        for(int j=1;j<=n;j++){
            
            nums[i++]=j;
        }
        boolean[] visited=new boolean[n];
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        permute(nums,visited,list,result);
        StringBuilder sb=new StringBuilder();
        for(Integer e:result.get(k-1)){
            sb.append(e);
        }
        return sb.toString();
    }

    private void permute(int[]nums,boolean[]visited,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                list.add(nums[i]);
                permute(nums,visited,list,result);
                list.remove(list.size()-1);
                visited[i]=false;
            }
        }
    }
}