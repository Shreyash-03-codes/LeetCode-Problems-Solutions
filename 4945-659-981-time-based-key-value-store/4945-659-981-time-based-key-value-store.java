class TimeMap {

    HashMap<String,TreeMap<Integer,String>> map=new HashMap<>();
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.get(key)==null){
            map.put(key,new TreeMap<>());
        }

        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            if(map.get(key).floorKey(timestamp)!=null){
            int k= map.get(key).floorKey(timestamp);
            return map.get(key).get(k);
            }
        }
        return "";
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */