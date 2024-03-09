public class PartTimeEmployee extends Person {
    private double payRate;
    private double hoursWorked;

    public PartTimeEmployee() { }

    public PartTimeEmployee(String first, String last,double rate, double hours) {
        super(first,last);
        payRate = rate;
        hoursWorked = hours;
    }

    public String toString()
    {
    return (super.toString() + "wages are: $" + calculatePay());
    }

    public double calculatePay() {
        return payRate * hoursWorked;
    }

    public void setNameRateHours(String first, String last, double rate, double hours) {
        super.setName(first, last);
        payRate = rate;
        hoursWorked = hours;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    } 
}
