class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        
        combine(1,n,k,result,list);
        return result;
        
    }
    
    private void combine(int i,int n,int k,List<List<Integer>> result,List<Integer> list){
        if(k==0){
            result.add(new ArrayList<>(list));
            return;
        }
        
        if(i>n){
            return;
        }
        
        list.add(i);
        combine(i+1,n,k-1,result,list);
        list.remove(list.size()-1);
        combine(i+1,n,k,result,list);
    }
}