class MyCalendarTwo {

    ArrayList<int[]> list;
    TreeMap<Integer,Integer> map;
    public MyCalendarTwo() {
        list=new ArrayList<>();
        map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer prev=map.lowerKey(end);
        if(prev!=null && start<=map.get(prev)-1){
            return false;
        }
        
        for(int[] booking:list){
            int cstart=Math.max(booking[0],start);
            int cend=Math.min(booking[1],end);
            
            if(cstart<cend){
                map.put(cstart,cend);
            }
        }
        
        list.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */