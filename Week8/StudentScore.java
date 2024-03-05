package Week8;

public class StudentScore {
    private String name;
    private double midtermScore ; 
    private double finalScore ; 
    // private double meanScore = (midtermScore + finalScore) * 0.5 ;


    public StudentScore(){
        
    }

    public StudentScore(String name , double midtermScore ,  double finalScore){
        this.name = name ; 
        this.midtermScore = midtermScore ;
        this.finalScore = finalScore ; 
    }


    public String getName(){
        return name ;
    }
    public double getMidtermScore() {
        return midtermScore;
    }
    public double getFinalScore() {
        return finalScore;
    }

    public double averageScore(){
        return (getMidtermScore() + getFinalScore()) * 0.5 ; 
    }

    public char grading() {
        char grade;

        switch ((int) (averageScore() / 10)) {
            case 10:
            case 9:
            case 8:
                grade = 'A';
                break;
            case 7:
                grade = 'B';
                break;
            case 6:
            grade = 'C';
            break;
            case 5:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

    return grade;
    }

}
