public class Student {
    private String name ; 
    private String lastname ; 
    private int score1;
    private int score2;
    private int score3;
    private double average ;
    
    public Student(String name ,String lastname , int score1 , int score2 , int score3){
        this.name = name;
        this.lastname = lastname;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public void Setname(String name){
        this.name = name ;
    }
    public void Setlastname(String lastname){
        this.lastname = lastname;
    }
    public void Setscore1(int score1){
        this.score1 = score1;
    }
    public void Setscore2(int score2){
     this.score2 = score2 ;
    } 
    public void Setscore3(int score3){
        this.score3 = score3 ;
    }

    public String getname(){
        return name;
    }
    public String getlastname(){
        return lastname ;
    }
    public int getscore1(){
        return score1;
    }
    public int getscore2(){
        return score2;
    }
    public int getscore3(){
        return score3;
    }

    public double getAverage(){
        average = (score1 + score2 + score3) / 3 ;
        return average ;
    }

}