class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        ArrayList<Integer> small=new ArrayList<>();
        ArrayList<Integer> equal=new ArrayList<>();
        ArrayList<Integer> large=new ArrayList<>();

        for(int a:nums){
            if(a<pivot){
                small.add(a);
            }
            else if(a==pivot){
                equal.add(a);
            }
            else{
                large.add(a);
            }
        }

        int i=0;

        for(Integer e:small){
            nums[i++]=e;
        }

        for(Integer e:equal){
            nums[i++]=e;
        }
        for(Integer e:large){
            nums[i++]=e;
        }
        return nums;
           
    }
}