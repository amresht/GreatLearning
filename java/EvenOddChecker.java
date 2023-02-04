/**
 * @task            Read two numbers min and max and Find  even and off between min to max 
 * @author          Amresh Tripathi
 * @date            4-Feb-2023
 * @version         1.0
 */
import java.util.*;  

public class EvenOddChecker {

	
  public static void main(String[] args) {
	  
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.print("Enter first number- ");  
	int min= sc.nextInt();  
	System.out.print("Enter second number- ");  
	int max= sc.nextInt();  
	// initialize sum as 0
    int countEven = 0;
    int countOdd  = 0;
	System.out.println("Min:" + min + " Max: " + max );
	
	for (int i=min ; i<=max ;i++) {
        if (i % 2 == 0) {
            countEven++;
            System.out.println(" The number " + i + " is even" );        
        }
        else {
            countOdd++;
            System.out.println(" The number " + i + " is odd" );
        }

	}
	
    System.out.println("Total Odd numbers:" + countOdd + " Even: " + countEven );
    
  }
}