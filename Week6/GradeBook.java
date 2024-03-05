//Lab 2: GradeBook.java
//GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
	private String courseName; 
	private String InstructorName; 
	
	
	// constructor initializes courseName with String supplied as argument
	public GradeBook( String name ) 
	{  
		courseName = name; // initializes courseName 
	} // end constructor 

	
	// Setter
	public void setCourseName( String name )
	{
		courseName = name; 
	} 

	public void setInstructorName( String name )
	{
		InstructorName = name; // store the course name
	} // end method setCourseName
	

	// Getter
	public String getCourseName()
	{
		return courseName;
	} 

	public String getInstructorName()
	{
		return InstructorName;
	} 

	
	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
		System.out.printf( "Welcome to the grade book for \n%s!\n", getCourseName() );
		System.out.printf( "This course is presented by: %s!\n", getInstructorName() );
	} 

} 