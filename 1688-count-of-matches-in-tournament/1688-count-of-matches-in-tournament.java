class Solution {
    public int numberOfMatches(int n) {
        
        return number(n);
        
    }
    
    public int number(int num){
        if(num==1){
            return 0;
        }
        
        if(num%2==0){
            return num/2+number(num/2);
        }
        
        if(num%2==1){
            return (num-1)/2+number((num+1)/2);
        }
        return 0;
    }
}