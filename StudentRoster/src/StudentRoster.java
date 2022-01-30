/**
 * Tazvik Ziauddin
 * Chapter 10 StudentRoster
 */
 
 import java.util.Scanner;
 
public class StudentRoster {
    
    public static void main(String[] args) {
    	
    int numStudents;
    String[] student;
    Scanner input = new Scanner(System.in);
    
    System.out.println("How many students in class?");
    numStudents = input.nextInt();
    student = new String[numStudents];	
    	
    for (int i = 0; i < student.length; i++) {
    	System.out.println("Write the names of the students:"); 
    	 student [i] = input.next();
    }
    
    System.out.println("Student Roster:");
    
     for (int i = 0; i < student.length; i++) {
     System.out.println(student[i]);
    }
 
    }
}
