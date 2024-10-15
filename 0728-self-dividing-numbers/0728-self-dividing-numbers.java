class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list=new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            if(self(i)){
                list.add(i);
            }
        }
        return list;
    }
    
    private boolean self(int num){
        int o=num;
        while(num!=0){
            int rem=num%10;
            if(rem==0 || o%rem!=0){
                return false;
            }
            num=num/10;
        }
        return true;
    }
}