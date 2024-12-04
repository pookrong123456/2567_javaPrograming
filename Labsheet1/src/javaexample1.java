import java.text.*;
import	java.util.*;
public class javaexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		
		System.out.print("Input productUnit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();
		
		
		float totalPriceofProduct = productUnit * productPrice;
		
		System.out.println("Total price is "+frm.format(totalPriceofProduct)+"Baht.");
		
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct * 7 / 10);
		System.out.println("Add VAT 7% is "+frm.format(totalwithVat)+"Baht.");
		System.out.println();
		
		input.close();
		
		
	}

}
