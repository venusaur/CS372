public class EmployeemanagementTest {
		
	
	public static void main (String[] args) {
		EmployeeManagement employee1 = new EmployeeManagement("Stella Robinson");
		
		employee1.employeeID(1313);
		employee1.employeeHireDate("10/23/2007");
		employee1.employeeBoss("Kiran Todd");
		employee1.employeePosition("Jr. Software Developer");
		
		employee1.printEmp();
				
	}
}
