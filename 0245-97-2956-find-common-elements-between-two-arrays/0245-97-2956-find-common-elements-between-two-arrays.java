class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int e:nums1){
            set1.add(e);
        }

        for(int e:nums2){
            set2.add(e);
        }

        int n1=0;
        int n2=0;

        for(int e:nums1){
            if(set2.contains(e)){
                n1++;
            }
        }

        for(int e:nums2){
            if(set1.contains(e)){
                n2++;
            }
        }

        return new int[]{n1,n2};

        
        
    }
}