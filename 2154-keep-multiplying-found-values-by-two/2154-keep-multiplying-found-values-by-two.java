class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int e:nums){
            set.add(e);
        }

        while(set.contains(original)){
            original*=2;
        }
        return original;
    }
}