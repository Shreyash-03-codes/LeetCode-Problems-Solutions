class MyCalendar {

    TreeMap<Integer,Integer> map;
    public MyCalendar() {
        map=new TreeMap<>();
        
    }
    
    public boolean book(int start, int end) {
        
        Integer prev=map.lowerKey(end);
        
        if(prev!=null && start<=map.get(prev)-1){
            return false;
        }
        
        map.put(start,end);
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */