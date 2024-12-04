import java.text.*;
import java.util.*;

public class Lab101 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Product Name : ");
		String productName = input.nextLine();
		
		System.out.print("Input Product Unit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input Price per Unit : ");
		double productPrice = input.nextFloat();
		double totalPrice = productPrice * productUnit;
        System.out.print("How many discount (%): ");
        double discountPercent = input.nextFloat();
        double discountAmount = (totalPrice * discountPercent) / 100;
        double finalAmount = totalPrice - discountAmount;
		
		System.out.println("--------------------------------------");
		System.out.println("Total price is "+(productPrice * productUnit)+"Baht.");
		System.out.println("--------------------------------------");
		
		
		
		
	}
}
