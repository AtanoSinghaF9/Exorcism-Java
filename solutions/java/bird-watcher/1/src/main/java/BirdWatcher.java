
class BirdWatcher {
    private final int[] birdsPerDay;
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
       
    }

    public static int[] getLastWeek() {
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return new int[]{0,2,5,3,7,8,4}; 
    }

    public int getToday() {
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
       return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
    birdsPerDay[birdsPerDay.length - 1]++;
}

    public boolean hasDayWithoutBirds() {
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
    int sum = 0;
    int limit = Math.min(numberOfDays, birdsPerDay.length);
    for (int i = 0; i < limit; i++) {
        sum += birdsPerDay[i];
    }
    return sum;
}

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int s=0;
        for(int i=0;i<birdsPerDay.length;i++){
          if(birdsPerDay[i]>=5){
              s++; 
          }  
        }
        return s;
    }
}
