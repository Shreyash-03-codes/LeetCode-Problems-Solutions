class MyCircularQueue {

    private int size;
    private int  f;
    private int  r;
    private int[] que;
    

    public MyCircularQueue(int k) {

        this.size=k;
        this.que=new int[this.size];
        this.r=this.f=-1;
        
    }
    
    public boolean enQueue(int value) {

        if(this.isFull()){

            return false;
        }
        else{

            if(this.r==-1){

                this.r=this.f=0;
                this.que[r]=value;
                return true;
            }
            else{

                r=(r+1)%this.size;
                this.que[this.r]=value;
                return true;
            }
        }
        
    }
    
    public boolean deQueue() {

        if(this.isEmpty()){
            return false;
        }
        else{
            if(this.f==this.r){
                this.r=this.f=-1;
                return true;
            }
            else{
                this.f=(this.f+1)%this.size;
                return true;
            }
        }
        
    }
    
    public int Front() {

        if(this.isEmpty()){
            return -1;
        }

        return this.que[this.f];

        
    }
    
    public int Rear() {

        if(this.isEmpty()){
            return -1;
        }

        return this.que[this.r];
        
    }
    
    public boolean isEmpty() {
        if(this.r==-1){
            return true;
        }
        return false;
        
    }
    
    public boolean isFull() {

        if((this.r+1)%this.size==this.f){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */