class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int a:arr1){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int[]nums=new int[arr1.length];
        int k=0;
        for(int a:arr2){
            if(map.containsKey(a)){
                for(int i=0;i<map.get(a);i++){
                    nums[k++]=a;
                }
                map.remove(a);
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(Integer e:map.keySet()){
                list.add(e);
        }

        Collections.sort(list);

        for(Integer e:list){
             for(int i=0;i<map.get(e);i++){
                    nums[k++]=e;
            }
        }

        return nums;
    }
}