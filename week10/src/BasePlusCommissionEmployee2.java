public class BasePlusCommissionEmployee2 {
    private CommissionEmployee com ;
    private double baseSalary;

    public BasePlusCommissionEmployee2() {
        com = new CommissionEmployee();
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee2( String first, String last,String ssn, double sales, double rate, double salary ) {
        com = new CommissionEmployee(first,last,ssn,sales,rate);
        baseSalary = salary;
    }

    public void setBaseSalary( double salary ) {
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary + com.earnings();
    }

    public String getFirstName() {
        return com.getFirstName();
    }

    public String getLastName() {
        return com.getLastName();
    }

    public String getSocialSecurityNumber() {
        return com.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return com.getGrossSales();
    }

    public double getCommissionRate(){
        return com.getCommissionRate();
    }


    public String toString() {
        return String.format( "%s %s\n%s: %.2f", "base-salaried",
        com.toString(), "base salary", getBaseSalary() );
    }


}
