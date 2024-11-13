class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int a:nums){
            if(!list.contains(a) && map.get(a)>=2 ){
                list.add(a);
                list.add(a);    
            }
           else if(map.get(a)==1){
               list.add(a);
           }
        }
        int k=0;
        for(Integer a:list){
            nums[k]=a;
            k++;
        }
       return list.size();
    }
}