class Solution {
    public int maximumSwap(int num) {
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();
        
        int maxEle = num; 
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    
                    maxEle = Math.max(maxEle, Integer.parseInt(new String(arr)));
                    
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        return maxEle;
    }
}