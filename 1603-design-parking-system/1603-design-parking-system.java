class ParkingSystem {
    
    int big;
    int medium;
    int small;
    
    int bigCar;
    int meiumCar;
    int smallCar;

    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
        
         this.bigCar=0;
         this.meiumCar=0;
         this.smallCar=0;
    }
    
    public boolean addCar(int carType) {
        
        if(carType==1){
            if(bigCar==big){
                return false;
            }
            
            bigCar++;
            return true;
        }
        
        if(carType==2){
            if(meiumCar==medium){
                return false;
            }
            
            meiumCar++;
            return true;
        }
        
        if(carType==3){
            if(smallCar==small){
                return false;
            }
            
            smallCar++;
            return true;
        }
        
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */