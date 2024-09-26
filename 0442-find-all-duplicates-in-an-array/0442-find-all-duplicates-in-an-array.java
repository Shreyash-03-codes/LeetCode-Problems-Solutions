class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int i=0;
        while(i<nums.length){

            int correct=nums[i]-1;

            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }
        }

        return list;
        
    }

    public void swap(int[]a,int i,int j){
        
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}