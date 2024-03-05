public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Kittipisut", "Chansri", 80, 75, 90);
        System.out.printf("%s %s\n",student.getname(),student.getlastname());
        System.out.println("The average score is: " + student.getAverage());
    }
}
