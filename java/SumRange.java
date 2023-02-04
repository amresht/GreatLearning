import java.util.*;  

public class SumRange {

	
  public static void main(String[] args) {
	  
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.print("Enter first number- ");  
	int min= sc.nextInt();  
	System.out.print("Enter second number- ");  
	int max= sc.nextInt();  
	// initialize sum as 0
	int sum = 0 ;
	
	for (int i=min ; i<=max ;i++) {
		sum += i;
	}
		
    System.out.println("Hello, Min:" + min + " Max: " + max + " Sum: " + sum );
  }
}