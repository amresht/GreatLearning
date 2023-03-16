/**
 * @class           Admin Department Class 
 * @author          Amresh Tripathi
 * @date            16-Mar-2023
 * @version         1.0
 */



package model;

public class AdminDepartment extends SuperDepartment{
	public static String departmentName() {
		return "Admin Department";
	}
	
	public static String getTodaysWork() {
		return "Complete your documents Submission";
		
	}
	public static String getWorkDeadline() {
		return "Complete by EOD";
	}
	

}
