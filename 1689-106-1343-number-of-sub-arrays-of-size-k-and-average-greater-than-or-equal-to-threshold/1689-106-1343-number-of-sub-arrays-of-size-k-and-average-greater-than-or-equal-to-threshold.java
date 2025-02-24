class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int left=0;
        int i=0;
        int sum=0;
        int count=0;
        for(int e:arr){
            i++;
            sum+=e;
            if(i==k){
                if(sum/k>=threshold){
                    count++;
                }
                sum-=arr[left];
                left++;
                i--;
            }
        }
        return count;
    }
}