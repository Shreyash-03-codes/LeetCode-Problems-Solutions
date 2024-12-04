class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int start=0;
        int last=people.length-1;
        int count=0;
        Arrays.sort(people);
        while(start<=last){
            if((people[start]+people[last])<=limit){
                start++;
            }
            
            last--;
            count++;
        }
        return count;
    }
}