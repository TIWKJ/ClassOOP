package Week8;

public class EmployeeArrayTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Ananya", "Sharma",  80000);
        employees[1] = new Employee("Arjun", "Patel",  70000);
        employees[2] = new Employee("Deepika", "Gupta",  50000);
        employees[3] = new Employee("Rahul", "Shah",  150000);
        employees[4] = new Employee("Priya", "Singh",  90000);
        employees[5] = new Employee("Aarav", "Kumar",  50000);
        employees[6] = new Employee("Sneha", "Joshi",  120000);
        employees[7] = new Employee("Vivek", "Mehta",  110000);
        employees[8] = new Employee("Ishaan", "Sharma",  80000);
        employees[9] = new Employee("Neha", "Gandhi",  120000 );


        for (Employee employee : employees) {
            employee.increaseSalary(5);
        }

        for (Employee employee : employees) {
            System.out.println("name: " + employee.getFirstname() + " " + employee.getLastname());
            System.out.println("salary: " + employee.getSalary());
            System.out.println();
        }
    }
}
