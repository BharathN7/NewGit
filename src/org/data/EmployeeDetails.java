package org.data;

public class EmployeeDetails {
  public void empName() {
	  System.out.println("Employee name = Bharath");
  }

  public void empID() {
	  System.out.println("Employee Id = 45623");
  }


  public static void main(String[] args) {
	EmployeeDetails emp=new EmployeeDetails();
	emp.empName();
	emp.empID();
	 
	for (int i = 0; i <=100; i++) {
		if (i%2==0) {
			System.out.println(i);
		}
	}
  
  
  
  
  }


}





