public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        if(speed>=1 && speed<=4){
            return 221.0*speed;
        }
        if(speed>=5 && speed<=8){
            return 221.0*speed*0.9;
        }
        if(speed==9){
            return 221.0*speed*0.8;
        }
         if(speed==10){
             return 221.0*speed*0.77;
         }
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
        return ((int)(productionRatePerHour(speed)))/60;
    }
}
