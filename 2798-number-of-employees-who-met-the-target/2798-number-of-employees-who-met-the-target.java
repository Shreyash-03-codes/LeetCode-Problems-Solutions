class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int e:hours){
            count=e>=target?count+1:count;
        }
        return count;
    }
}