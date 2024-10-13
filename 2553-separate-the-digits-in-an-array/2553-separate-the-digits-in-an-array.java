class Solution {
    public int[] separateDigits(int[] nums) {
        
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            
            ArrayList<Integer> l=addDigit(nums[i]);
            for(Integer a:l){
                list.add(a);
            }
        }
        
        int[] arr=new int[list.size()];;
        
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    
    private ArrayList<Integer> addDigit(int n){
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0){
            int num=n%10;
            list.addFirst(num);
            n=n/10;
        }
        return list;
    }
}