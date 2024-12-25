class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        
        HashSet<Integer> set=new HashSet<>();
        for(int e:nums){
            set.add(e);
            set.add(reverse(e));
        }
        
        return set.size();
       
        
    }
    
    private int reverse(int n){
        if(n<=9){
            return n;
        }
        
        int num=0;
        
        while(n!=0){
            num=num*10+(n%10);
            n/=10;
        }
        return num;
    }
}