class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        if(knightIsAwake==false){
            return true;
        }
        return false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        if(knightIsAwake==true || archerIsAwake==true || prisonerIsAwake==true){
            return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        if(archerIsAwake==false && prisonerIsAwake==true){
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    if(petDogIsPresent){
        return !archerIsAwake;
    }   
        else{
     return prisonerIsAwake && !knightIsAwake && !archerIsAwake;    
        }
        
    }
}
