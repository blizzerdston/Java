import java.io.*;

public class StuName implements  Serializable {
	private String stuFirstName;
	private String stuLastName;
	
	/**
	 * constructor
	 * pre: none
	 * post: A student object has been created.
	 * Student data has been initialized with parameters.
	 */
	 public StuName(String fName, String lName) {
	 	stuFirstName = fName;
	 	stuLastName = lName;
	 }
	 
	 /**
	  * Creates a string representing the student object
	  * pre: none
	  * post: A string representing the student object
	  * has been returned
	  */
	  public String toString() {
	  	String stuString;
	  	
	  	stuString = stuFirstName + " " + stuLastName;
	  	return(stuString);
    }	
}
