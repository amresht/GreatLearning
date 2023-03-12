/**
 * @class           Employee Driver Class 
 * @author          Amresh Tripathi
 * @date            12-Mar-2023
 * @version         1.0
 */
package main;
import java.util.Scanner;
import model.Employee;
import services.*;


public class EmployeeDriver {


	public static void main(String[] args) {
	
		Employee employee;
		String emailAddress;
		
		String[] strDeptt = new String[] { "Technical",  "Admin", "HR", "Legal"};
		
		
		
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter your First Name: ");  
		String firstName= sc.nextLine();
		System.out.print("Enter your Last Name: ");  
		String lastName= sc.nextLine();  
		System.out.println("Welcome "+ firstName + " " + lastName +". Please select your department:");    
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int deptt= sc.nextInt();
		// check if invalid deptt entered
		if (deptt <0 && deptt >4 ) {
			System.out.println("Invalid Department");
			System.exit(1);
		}
		// Create the employee object
		employee  = new Employee(firstName, lastName, strDeptt[deptt-1]) ; // TASK (b) (e)
		// create a new credential service object
		CredentialService cs = new CredentialService(employee);
		// TASK(a) create the email and set to employee object
		emailAddress = cs.generateEmail(employee);
		employee.setEmail(emailAddress);
		// TASK(c) create the password and set to employee object		
		String passwd  = cs.generatePassword(8);
		employee.setPassword(passwd);
		// TASK (f) Finally print the employee's credentials
		cs.ShowCredentials(employee);
		
		
	}
}

