/**
 * @class           Departments' superclass Class 
 * @author          Amresh Tripathi
 * @date            16-Mar-2023
 * @version         1.0
 */


package model;

public class SuperDepartment {

	public SuperDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	public static String departmentName() {
		return "Super Department";
	}
	
	public static String getTodaysWork() {
		return "No Work as of now";
		
	}
	public static String getWorkDeadline() {
		return "Nil";
	}
	
	public static String isTodayAHoliday() {
		return "Today is not a holiday";
	}
	

}
