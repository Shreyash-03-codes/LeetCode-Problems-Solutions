class Bank {

    int n;
    HashMap<Integer,Long> map=new HashMap<>();
    public Bank(long[] balance) {
        this.n=balance.length;
        for(int i=0;i<n;i++){
            map.put(i+1,balance[i]);
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {

        if((account1>=1 && account1<=n) && (account2>=1 && account2<=n)){
            if(map.get(account1)>=money){
                map.put(account1,map.get(account1)-money);
                map.put(account2,map.get(account2)+money);
                
                return  true;
                
            }
            else{
                return false;
            }
        }

        return false;
        
    }
    
    public boolean deposit(int account, long money) {
        if(account>=1 && account<=n){
            map.put(account,map.get(account)+money);
            return true;
        }
        return false;

    }
    
    public boolean withdraw(int account, long money) {
        if(account>=1 && account<=n){
            if(map.get(account)>=money){
                map.put(account,map.get(account)-money);
                return true;
            }
        }
        return false;
        
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */