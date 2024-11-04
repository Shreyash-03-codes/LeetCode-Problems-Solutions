class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        sum(1,k,n,result,list);
        return result;
    }
    
    private void sum(int ind,int k,int target,List<List<Integer>> result,List<Integer> list){
        if(list.size()==k){
            if(target==0){
                result.add(new ArrayList<>(list));
            }
            return;
        }
        
        for(int i=ind;i<=9;i++){
            if(i<=target){
                list.add(i);
                sum(i+1,k,target-i,result,list);
                list.removeLast();
            }
        }
    }
}