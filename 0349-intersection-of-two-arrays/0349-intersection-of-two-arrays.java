class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        
        int[] arr=new int[1000];
        int k=0;
        int count=0;
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                count++;
                arr[k++]=nums2[i];
                set.remove(nums2[i]);
            }
        }
        return Arrays.copyOfRange(arr,0,count);
    }
}