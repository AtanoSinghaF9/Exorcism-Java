class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    int driven=0;
    int battery=100;
    NeedForSpeed(int speed, int batteryDrain) {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed constructor");
        this.speed=speed;
        this.batteryDrain=batteryDrain;
    }

    public boolean batteryDrained() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
        return battery<this.batteryDrain;
    }

    public int distanceDriven() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
        return driven;
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
        if(batteryDrained()){
            return;
        }
        this.driven+=this.speed;
        this.battery-=this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
     return new NeedForSpeed(50, 4);   
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        //throw new UnsupportedOperationException("Please implement the RaceTrack constructor");
        this.distance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        //throw new UnsupportedOperationException("Please implement the RaceTrack.canFinishRace() method");
    while (!car.batteryDrained() && car.distanceDriven() < this.distance) {
        car.drive();
    }
    return car.distanceDriven() >= this.distance;    
    }
}