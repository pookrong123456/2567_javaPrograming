
public class Invoice {
	private int invid;
	private Customer customer;
	private double amount;
	
	Invoice(int invid, Customer customer,double amount){
		this.invid =invid;
		this.customer =customer;
		this.amount =amount;
	}
	public int getInvoiceID() {
		return this.invid;
		
	}
	public double getAmount() {
		return this.amount;
		
	}
	public void setAmount(double amount) {
		this.amount =amount;
	}

	public void setcoustomer(Customer customer) {
		this.customer =customer;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public int getCustomerID() {
		return this.getCustomer().getID();		
	}
	public String getCustomerName() {
		return this.getCustomer().getName();
	}
    public int getCustomrDiscount() {
		return this.getCustomer().getdiscount();
	}
	public double getAmountAfterDiscount() {
		return this.getAmount() - (this.getAmount()*this.getCustomrDiscount()/100);
	}
	public String toString() {
		return "Invoicelid= " + this.getInvoiceID()+",customer="+ customer.toString()+",amount="+this.getAmountAfterDiscount();
	}
	
	
	
}
