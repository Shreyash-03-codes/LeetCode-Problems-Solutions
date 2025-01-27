class FindSumPairs {

    private int[]nums1;
    private int[]nums2;
    private HashMap<Integer,Integer> map=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        for(int a:this.nums2){
            map.put(a,map.getOrDefault(a,0)+1);
        }
    }
    
    public void add(int index, int val) {
        map.put(nums2[index],map.get(nums2[index])-1);
        nums2[index]+=val;
        map.put(nums2[index],map.getOrDefault(nums2[index],0)+1);
        
    }
    
    public int count(int tot) {
       
        int count=0;

        

        for(int a:nums1){
            int find=tot-a;
            if(map.containsKey(find)){
                count+=map.get(find);
            }
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */