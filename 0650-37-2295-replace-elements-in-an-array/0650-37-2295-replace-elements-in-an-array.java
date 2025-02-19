class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int[]a:operations){
            if(map.containsKey(a[0])){
                int ind=map.get(a[0]);
                nums[ind]=a[1];
                map.put(nums[ind],ind);
            }
        }
        return nums;
    }
}