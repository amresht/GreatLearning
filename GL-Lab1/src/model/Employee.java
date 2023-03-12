/**
 * @class            Employee Class 
 * @author          Amresh Tripathi
 * @date            12-Mar-2023
 * @version         1.0
 */

package model;

public class Employee {


	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	
	public Employee() {
		
	}
	
	// TASK(b)
	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + ", email="
				+ email + ", password=" + password + "]";
	}


	
	
}


