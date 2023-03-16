/**
 * @class           HR Department's  Class 
 * @author          Amresh Tripathi
 * @date            16-Mar-2023
 * @version         1.0
 */

package model;

public class HrDepartment extends SuperDepartment{
	public static String departmentName() {
		return "Hr Department";
	}
	
	public static String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
		
	}
	public static String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public static String doActivity() {
		return "Team lunch";
	}	

}
