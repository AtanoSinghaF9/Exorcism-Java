public class JedliksToyCar {
    int distance;
    int percent=100;
    public static JedliksToyCar buy() {
       // throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
        return "Driven "+ distance + " meters";
    }

    public String batteryDisplay() {
       if (percent > 0) {
        return "Battery at " + percent + "%";
    } else {
        return "Battery empty";
    }
    }

    public void drive() {
       
    if (percent > 0) {
        
        distance += 20;
        
        percent -= 1;
    }
    
        }
}

