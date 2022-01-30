
public class Search {
 /**
 * Returns the index of the element numToFind.
 * -1 returned if element not found.
 * pre: none
 * post: index of numToFind has been returned. -1 has been
 * returned if element not found.
 */
 public static int linear(int[] array, int nameToFind) {
  int index = 0;

 while ((array[index] != nameToFind) &&
    (index < array.length - 1)) {
    index += 1;
    }

 if (array[index] == nameToFind) {
       return(index);
 } else {
     return(-1);
       }
      }
   
   public static int linear (String[] names, String nameToFind ) {
   	int index = 0;
   	
   	while ((names[index].equals(nameToFind)) && 
   		(index < names.length - 1)) {
   			index += 1;
   	   }
   	   
   	   if (names[index].equalsIgnoreCase(nameToFind)){
   	   	   return(index);
   	   } else {
   	   	return(-1);
   	   }
     }
   }