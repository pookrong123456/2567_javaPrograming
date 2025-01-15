import java.util.Scanner;

public class TestStudentsInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Eter details for employee 1:");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHourWorked1 = scan.nextInt();
		System.out.print("Hoursly Rate: ");
		double empHourRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHourWorked1, empHourRate1);
		Line('-');
		emp1.displayStudentDetails();
		Line('*');
		
		scan.nextLine();
		
		System.out.println("Eter details for employee 1:");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHourWorked2 = scan.nextInt();
		System.out.print("Hoursly Rate: ");
		double empHourRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, empHourWorked2, empHourRate2);
		Line('-');
		emp2.displayStudentDetails();
		Line('*');
		
		

		scan.close();
	}
	public static void Line(char symbol) {
		//System.out.print("--------------------------------------------------");
		for(int i=1;i<50;i++) {
			System.out.print(symbol);
		}
	}

}
