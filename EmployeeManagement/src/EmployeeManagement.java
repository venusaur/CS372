
public class EmployeeManagement {
	
	int ID; 
	String name; 
	String HireDate; 
	String position; 
	String boss; 
	
	//Constructor
	public EmployeeManagement (String employeename) {
		name = employeename; 
	}
	
	public void employeeID(int EmpID) {
		ID = EmpID; 
	}
	
	public void employeeHireDate(String EmpHireDate) {
		 HireDate = EmpHireDate; 
	}
	
	public void employeePosition (String EmpPosition) {
		position = EmpPosition; 
	}
	public void employeeBoss (String EmpBoss) {
		boss = EmpBoss; 
	}


	public void printEmp() {
		System.out.println("Name: "+ name);
		System.out.println("ID: " + ID);
		System.out.println("Date Hired: " + HireDate);
		System.out.println("Current Position: " + position);
		System.out.println("Reports too: " + boss);
	}
}
