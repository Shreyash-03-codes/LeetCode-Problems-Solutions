class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[]result=new int[nums.length];
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        
        for(int n:nums){
            if(n>0){
                pos.add(n);
            }
            else{
                neg.add(n);
            }
        }
        
        int k=0;
        for(int i=0;i<neg.size();i++){
            result[k++]=pos.get(i);
            result[k++]=neg.get(i);
        }
        return result;
    }
}