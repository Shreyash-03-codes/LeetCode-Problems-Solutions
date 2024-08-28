class Solution {
    public int countOperations(int num1, int num2) {
        
        if(num1==0 || num2==0){
            return 0;
        }
        
        if(num1==num2){
            return 1;
        }
        
        
        return count(num1,num2,0);
    }
    
    public int count(int n1,int n2,int c){
        
        if(n1==n2){
            return c+1;
        }
        
        if(n1>n2){
            return count(n1-n2,n2,c+1);
        }else{
        
            return count(n1,n2-n1,c+1);
        }
        
    }
}