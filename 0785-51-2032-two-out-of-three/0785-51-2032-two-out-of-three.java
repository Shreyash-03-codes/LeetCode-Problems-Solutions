class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
         HashSet<Integer> set2=new HashSet<>();
         HashSet<Integer> set3=new HashSet<>();
        for(int a:nums1){
            set1.add(a);
        }
        for(int a:nums2){
            if(set1.contains(a) && !set3.contains(a)){
                list.add(a);
                set3.add(a);
                set1.remove(a);
            }
            else{
                set2.add(a);
            }
        }
        set1.addAll(set2);
        for(int a:nums3){
            if(set1.contains(a) && !set3.contains(a)){
                list.add(a);
                set3.add(a);
                set1.remove(a);
            }
       
        }

        return list;
        
    }
}