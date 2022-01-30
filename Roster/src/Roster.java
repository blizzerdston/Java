/**
 * Tazvik Ziauddin
 * Chapter 12 Roster	
 */
 
 import java.io.*;
 import java.util.Scanner;
 
public class Roster {
    
    public static void main(String[] args) {
    String file;
    String fName;
    String lName;
    int numStu;
    Scanner input = new Scanner(System.in);
    
    	
    	System.out.print("Enter the name of the file to create : ");
    	file = input.next();
    	File stuFile = new File(file);
    	System.out.print("Enter the number of students in the class : ");
    	numStu = input.nextInt();
    	
    	try {
    		/* write objects */
    		FileOutputStream out = new FileOutputStream(stuFile);
    		ObjectOutputStream writeStu = new ObjectOutputStream(out);
    		for (int i = 0; i < numStu ; i++ ) {
    			System.out.print("Enter the first  name of the student: ");
    			fName = input.next();
    			System.out.print("Enter the last name of the student: ");
    			lName = input.next();
    			writeStu.writeObject(new StuName(fName ,lName));
    		}
    		writeStu.close();
    		System.out.println("Data written to file.");
    		
    		/* read objects */
    		FileInputStream in = new FileInputStream(stuFile);
    		ObjectInputStream readStu = new ObjectInputStream(in);
    		for (int i = 0; i < numStu; i++) {
    		StuName student = (StuName)readStu.readObject();
    		System.out.println(student);
    		readStu.close();
    		}
    		
    		   
    		
    			
    	} catch (FileNotFoundException e) {
    		System.out.println("File could not be found.");
    		System.err.println("FileNotFoundException: " + e.getMessage());
    	} catch (IOException e) {
    		System.out.println("Problem with input/output.");
    		System.err.println("IOException: " + e.getMessage());
    	} catch (ClassNotFoundException e) {
    		System.out.println("Class could not be used to cast object.");
    		System.err.println("ClassNotFoundException: " + e.getMessage());
    	}
    
    }
}
