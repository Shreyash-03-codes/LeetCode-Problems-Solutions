class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        for(int i=0,j=i+1,k=j+1;k<arr.length;i++,j++,k++){
           
                    if(arr[i]%2==1 && arr[j]%2==1 && arr[k]%2==1){
                        return true;
                    }
 
        }
        
        return false;
    }
}