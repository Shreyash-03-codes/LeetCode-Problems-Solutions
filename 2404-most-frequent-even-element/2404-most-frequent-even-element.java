class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]%2==0){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        }
        
       
        int result=Integer.MIN_VALUE;
        int k=-1;
        
        for(Integer key:map.keySet()){
            if(map.get(key)>result){
                result=map.get(key);
                k=key;  
            }
            else if(map.get(key)==result){
                if(key<k){
                    k=key;
                }
            }
        }
        
        return k;
    }
}