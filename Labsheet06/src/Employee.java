
public class Employee {
	private String name;
	private int hourWorked;
	private double hourIyRate;
	
	public void setEmployeeDetails(String empName,int hours,double rate) {
		name = empName;
		hourWorked = hours;
		hourIyRate = rate;
		
		
	}
	public double calculateDetails() {
		double salary = hourWorked * hourIyRate;
		if(hourWorked>40) {
			double bonus = salary * 0.10;
			salary += bonus;
			
		}
		return salary;
	}
	public void displayStudentDetails(){
		System.out.println("Name: "+ name);
		System.out.println("Houurs Worked: "+ hourWorked);
		System.out.println("Houurs Rate: "+ hourIyRate);
		System.out.println("Totai Salary: "+ calculateDetails());
		
	}
	

}
