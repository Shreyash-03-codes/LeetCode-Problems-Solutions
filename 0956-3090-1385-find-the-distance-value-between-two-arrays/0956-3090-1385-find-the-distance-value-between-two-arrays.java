class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int count=0;
        for(int e:arr1){
            boolean flag=true;
            for(int a:arr2){
                if(Math.abs(e-a)<=d){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}