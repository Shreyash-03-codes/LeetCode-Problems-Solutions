class Solution {
    public double average(int[] salary) {
        
        double sum=0;
       
        double max=0;
        double min=Double.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            sum+=(double)salary[i];
            if(max<salary[i]){
                max=(double)salary[i];
            }
            
             if(min>salary[i]){
                min=(double)salary[i];
            }
        }
        
        return (sum-(max+min))/(salary.length-2);
    }
}