class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length<3){
            return false;
        }
        int ind=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                ind=i;
            }
        }
        if(ind==arr.length-1 || ind==0){
            return false;
        }
        for(int i=0;i<ind;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for(int i=ind+1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]){
                return false;
            }
        }

        return true;
        
    }
}