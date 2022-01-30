/**
 * Tazvik Ziauddin
 * Chapter 10 FindName
 */
 
 import java.util.Scanner;
 import java.util.Random;

 public class FindName {
 	
 public static void main(String[] args) {
  final int MAX = 3;
  String[] names;
  Random rand = new Random();
  Scanner input = new Scanner(System.in);
  int numNames, location;

    /* fill array with random numbers */
      for (int i = 0; i < names.length;i++) {

 }
   /* prompt user for a number to search for */
   System.out.print(" How many names are there? ");
   numNames = input.nextInt();
   System.out.print("Names to find: " + numNames);
   names = new String[numNames]; 

 /* Search for number and notify user of num location */
  location = Search.linear(names, numNames);
   if (location == -1) {
    System.out.println("Sorry, name not found in array.");
 } else {
 	System.out.println("First occurence is element " 
 		+ location);
      }
     }
   }
 
 
 
