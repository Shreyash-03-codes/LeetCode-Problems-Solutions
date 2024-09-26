class MyCircularDeque {

    int f;
    int r;
    int size;
    int[] queue;

    public MyCircularDeque(int k) {

        this.f=-1;
        this.r=-1;
        this.size=k;
        this.queue=new int[this.size];
        
    }
    
    public boolean insertFront(int value) {

        if(isFull())
        {
            return false;
        }

        if(this.f==-1){
            this.f=0;
            this.r=0;
            this.queue[this.f]=value;
            return true;
        }
        else if(this.f==0){
            this.f=this.size-1;
            this.queue[this.f]=value;
        }
        else{

            this.f--;
            this.queue[this.f]=value;
            
        }
        return true;
        
    }
    
    public boolean insertLast(int value) {

        if(this.isFull()){
            return false;
        }

        if(isEmpty()){
            this.f=0;
            this.r=0;
            this.queue[this.r]=value;
            return true;
        }
        else if(this.r==this.size-1){
            this.r=0;
            this.queue[this.r]=value;
        }
        else{

        this.r++;

        this.queue[this.r]=value;
        }
        return true;

        
    }
    
    public boolean deleteFront() {

        if(this.isEmpty()){
            return false;
        }

        if(this.r==this.f){
            this.r=this.f=-1;
        }
        else if(this.f==this.size-1){
            this.f=0;
        }
        else{
        this.f++;
        }

        return true;
        
    }
    
    public boolean deleteLast() {

        if(this.isEmpty()){
            return false;
        }

        else if(this.f==this.r){
            this.r=this.f=-1;
        }
        else if(this.r==0){
            this.r=this.size-1;
        }
        else{
        this.r--;
        }
        return true;
        
    }
    
    public int getFront() {

        if(this.isEmpty()){
            return -1;
        }

        return this.queue[this.f];
        
    }
    
    public int getRear() {
        
          if(this.isEmpty()){
            return -1;
        }

         return this.queue[this.r];
      
    }
    
    public boolean isEmpty() {

        if(this.f==-1){
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
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */