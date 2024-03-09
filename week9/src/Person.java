public class Person {

    private String firsName;
    private String lastName;
    
    Person(){}
    
    public Person(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }
    
    public String toString() {
        return "firsName = " + firsName + ", lastName = " + lastName + " ";
    }
        
    public void setName(String firsName,String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }
    public String getLastName() {
        return lastName;
    }
 
    
    
}