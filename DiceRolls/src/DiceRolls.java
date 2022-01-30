/**
 * Tazvik Ziauddin
 * Chapter 10 DiceRolls
 */
 
 import java.util.Scanner;
 import java.lang.Math;
 
public class DiceRolls {
    
    public static void main(String[] args) {
    	int[] outcomes = new int [];
    	Scanner input = new Scanner(System.in);
    	int numRolls;
    	int outcome;
    	int numSides;
    	int numDice;
    	
     /* prompt user for number of rolls */
     System.out.println("How many sides on each die?");
     numSides = input.nextInt();
     System.out.println("How many dice?");
     numDice = input.nextInt();
     System.out.print("How many rolls? ");
     numRolls = input.nextInt();
     input.close();
     
     /* roll dice and add to outcomes */
     for (int roll = 0; roll < numRolls; roll++) {
     	outcome = (int)(6 * Math.random() + 1) 
     		+ (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) ;
     		outcomes[outcome] += 1;
     	for (int die = 0; die < numDice; die++) {
     		outcome = 
     	}
     }
     
     /* show counts of outcomes */
     for (int i = numDice; i <= numDice * numSides; i++) {
     	System.out.println(i + ": " + outcomes[i]);
     }    
    	
    
    }
}
