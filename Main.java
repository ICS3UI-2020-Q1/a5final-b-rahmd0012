import java.util.Scanner;
/**
 * Getting the sum of all the odd numbers from a user from 1 to the user entered number
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask the user for a maximum number to sum
    System.out.println("Please enter the maximum number to sum to:");
    int n = input.nextInt();
    
    // the accumulator variable to add the count into
    int total = 0;
    
    // create a for loop
    for(int count = 1; count <= n; count++){
      if(count%2 != 0){
      // create a total for the numbers decsending
      total = total + count;
      } 
    }
    // print the total
    System.out.println("The sum of the odd numbers is " + total);
    }
}

