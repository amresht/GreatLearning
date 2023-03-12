/**
 * @Class            Credentials Interface 
 * @author          Amresh Tripathi
 * @date            12-Mar-2023
 * @version         1.0
 */
package services;

import model.Employee;

public interface Credentials {
	
	  String generateEmail(Employee emp);
	  String generatePassword(int length);
	  void ShowCredentials(Employee emp);
}
