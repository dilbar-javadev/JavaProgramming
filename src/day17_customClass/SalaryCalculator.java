package day17_customClass;

public class SalaryCalculator {

    public int hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public void setInfo(int hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public  double stateTax(){
        return stateTaxRate * salary();
    }

    public double federalTax(){
        return federalTaxRate * salary();
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator1 = new SalaryCalculator();

        salaryCalculator1.setInfo(50,0.3, 0.2, 40);
        System.out.println(salaryCalculator1 + "\nSalary: " + salaryCalculator1.salary()
        + "\nState tax: " + salaryCalculator1.stateTax()
        + "\nFederal tax: " + salaryCalculator1.federalTax()
        + "\nSalary after tax: " + salaryCalculator1.salaryAfterTax());


    }

}
