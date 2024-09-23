class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int a:nums){
            set.add(a);
        }
        int[] arr=new int[set.size()];
        int k=0;
        for(Integer a:set){
            arr[k++]=a;
        }
        Arrays.sort(arr);
        
        if(arr.length<3){
            return arr[arr.length-1];
        }
        else{
            return arr[arr.length-3];
        }
        
    }
}