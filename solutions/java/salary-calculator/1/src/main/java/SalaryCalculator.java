public class SalaryCalculator {
    double salary;
    public double salaryMultiplier(int daysSkipped) {
       // throw new UnsupportedOperationException("Please implement the SalaryCalculator.salaryMultiplier() method");
        if(daysSkipped>=5){
            return 0.85;
        }
        return 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
        if(productsSold>=20){
            return 13;
        }
        return 10;
    }

    public double bonusForProductsSold(int productsSold) {
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductsSold() method");
        return productsSold*bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
       // throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
       double mulSal=1000.00*salaryMultiplier(daysSkipped);
        mulSal+=bonusForProductsSold(productsSold);
        if(mulSal<=2000.00){
            return mulSal;
        }
        return mulSal-1.0;
    } 
}
