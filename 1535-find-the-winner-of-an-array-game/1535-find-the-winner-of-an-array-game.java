class Solution {
    public int getWinner(int[] arr, int k) {
        
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i])    ;
        }
        
        if(arr.length<k){
            return max;
        }
        
        int streak=0;
        int large=arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            if(large<arr[i]){
                large=arr[i];
                streak=1;
            }
            else{
                streak++;
            }
            
            if(streak==k || large==max){
                return large;
            }
        }
        
        return large;
    }
}