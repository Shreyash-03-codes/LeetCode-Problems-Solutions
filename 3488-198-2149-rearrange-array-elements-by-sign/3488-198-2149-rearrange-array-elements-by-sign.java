class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int e:nums){
            if(e<0){
                neg.add(e);
            }
            else{
                pos.add(e);
            }
        }

        int i=0;
        int n=0;
        int p=0;

        while(p<pos.size() && n<neg.size()){
            nums[i++]=pos.get(p++);
            nums[i++]=neg.get(n++);
        }

        return nums;
        
    }
}