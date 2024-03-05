package Week8;

public class testStudentScore {
    public static void main(String[] args) {
        StudentScore[] students = new StudentScore[5];
        students[0] = new StudentScore("Somchai", 30.5, 50.2);
        students[1] = new StudentScore("Joy", 80.8, 85.2);
        students[2] = new StudentScore("Bix", 50.0, 50.0);
        students[3] = new StudentScore("Ham", 60.0, 60.0);
        students[4] = new StudentScore("Dan", 71.0, 70.0);
        
       
        for(StudentScore i : students) {
            System.out.println("name : " + i.getName() + " midterm score : " +
            i.getMidtermScore() + " final score : " +
            i.getFinalScore() + " average : " +
            i.averageScore() + " grade : " +
            i.grading());
        }
       

    }
    
}
