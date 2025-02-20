class Solution {
    public int[] sortEvenOdd(int[] nums) {
        boolean flag=true;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        
        for(int e:nums){
            if(flag){
                even.add(e);
            }
            else{
                odd.add(e);
            }
            flag=!flag;
        }

        Collections.sort(even);
        Collections.sort(odd);
        
        int i=0;
        int j=odd.size()-1;
        int k=0;

        while(i<even.size() && j>=0){
            nums[k++]=even.get(i++);
            nums[k++]=odd.get(j--);
            
        }

        while(i<even.size()){
            nums[k++]=even.get(i++);
         
            
        }
        while( j>=0){
            
            nums[k++]=odd.get(j--);
            
        }
        
        return nums;
    }
}