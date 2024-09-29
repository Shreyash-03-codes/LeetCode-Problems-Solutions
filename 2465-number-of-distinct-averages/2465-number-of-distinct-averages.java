class Solution {
    public int distinctAverages(int[] nums) {
     
        HashSet<Double> set=new HashSet<>();
        
        Arrays.sort(nums);
        int i,j;
        for(i=0,j=nums.length-1;i<j;i++,j--){
            set.add(((double)nums[i]+(double)nums[j])/2);
        }
        return set.size();
    }
}