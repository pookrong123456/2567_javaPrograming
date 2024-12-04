import java.util.*;

import javax.swing.text.DefaultEditorKit.BeepAction;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declare constants
		 final double RASE_SALARY = 1000.0;
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 while(true) {
			 System.out.print("Enter gross for the saiesperson(or -1 to end):");
			 sales = input.nextInt();
			 if(sales==SENTINEL) {
				 break;
			 }
			 salary = RASE_SALARY + (sales * COMMISSION_RATE);
			 System.out.printf("The saleperson's salary is : $%.2f",salary);
		 }
		 System.out.println("bye");

		input.close();
	}

}
