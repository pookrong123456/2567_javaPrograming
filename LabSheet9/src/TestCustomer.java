
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 //Customer's toString()
		 System.out.println(c1);
		 
		 
		 //set customer's discount is 5
		 //Customer's toString()
		 
		 c1.setDiscount(5);
		 System.out.println(c1);

		 Line();
		 
		 System.out.println("id is: " + c1.getID());
		 //show customer's id
		 //show customer's name
		 System.out.println("Name is: " + c1.getName());
		 //show customer's discount
		 System.out.println("Discount is: " + c1.getdiscount());
		 Line();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		 //Invoice's toString()
		 System.out.println(inv1);
		 inv1.setAmount(10000);
		 //set invoice's amount is 10000
		 System.out.println(inv1);
		 //Invoice's toString()

		 Line();
		 //show invoice's id
		 System.out.println("invoice id is: "+inv1.getInvoiceID());
		 //Customer's toString() by instance inv1
		 System.out.println("customerc is: " + inv1.getCustomer());
		 //show invoice's amount
		 System.out.println("amount is: " + inv1.getAmount());
		 Line();
		 //show customer's id by instance inv1
		 System.out.println("customerc's id : " + inv1.getCustomerID());
		 //show customer's name by instance inv1
		 System.out.println("customerc's name : " + inv1.getCustomerName());
		 //show customer's discount by instance inv1
		 System.out.println("customerc's discount : " + inv1.getCustomrDiscount());
		 //show invoice's amount after discount(format as output)
		 System.out.printf("amount after discount is: %.2f", inv1.getAmountAfterDiscount());
		 } //end of main method()
		 public static void Line() {
		  for(int i =1;i<40;i++) {
			  System.out.println("*");
		  }
		  System.out.println();
	}

}
