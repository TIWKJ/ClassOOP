public class EmployeeTest {
    public static void main(String[] args) {
        Employee E1 = new Employee("Bob", "Jones", 34500.00);
        E1.increaseSalary(10);
        System.out.printf("Employee1: %s %s; Yearly Salary: %.2f\n",E1.getFirstname(),E1.getLastname(),E1.getSalary());

        Employee E2 = new Employee("Susan", "Baker", 37809.00);
        E2.increaseSalary(10);
        System.out.printf("Employee2: %s %s; Yearly Salary: %.2f\n",E2.getFirstname(),E2.getLastname(),E2.getSalary());


    }
}
