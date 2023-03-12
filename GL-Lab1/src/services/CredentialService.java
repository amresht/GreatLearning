/**
 * @Class           Credentials Service Class [TASK(f)]
 * @author          Amresh Tripathi
 * @date            12-Mar-2023
 * @version         1.0
 */
package services;
import java.util.Random;

import model.Employee;

public class CredentialService implements Credentials{


	public CredentialService(Employee emp) {

	}


	@Override
	public  String generateEmail(Employee emp) {
		String email;

		email = emp.getFirstName() + emp.getLastName() + "@" + emp.getDepartment() + ".gl.com" ;

		return email.toLowerCase();
	}

	@Override
	public String  generatePassword(int length) {
		String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowers = "abcdefghijklmnopqrstuvwxyz";
		String specialChars = "[]{}%&!@#$";
		String nums = "0123456789";

		String combinedChars = capitals + lowers + specialChars + nums;
		Random random = new Random();
		//this is our password
		char[] password = new char[length];

		// first make sure that we get at least one type of character for the password
		password[0] = lowers.charAt(random.nextInt(lowers.length()));
		password[1] = capitals.charAt(random.nextInt(capitals.length()));
		password[2] = specialChars.charAt(random.nextInt(specialChars.length()));
		password[3] = nums.charAt(random.nextInt(nums.length()));

		// now we generate random characters for the remaining length of the password 
		for(int i = 4; i< length ; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return toString(password);
	}

	@Override
	public void ShowCredentials (Employee emp) {
		//System.out.println(emp.toString());
		System.out.print("Name: "+  emp.getFirstName() + " ");
		System.out.println(emp.getLastName());
		System.out.println("Dept: " + emp.getDepartment());
		System.out.println("Email: " + emp.getEmail());
		System.out.println("Password" + emp.getPassword());

	}

	public static String toString(char[] charArray)
	{
		// Creating object of String class
		String string = new String(charArray);

		return string;
	}

}
