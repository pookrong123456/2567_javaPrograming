
public class Customer {
	private String name;	
	private int id;
	private int discount;
	
	Customer(int id,String name,int discount){
		this.id =id;
		this.name=name;
		this.discount=discount;
	}
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getdiscount() {
		return this.discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String toString() {
		return getName()+"("+getID()+")("+getdiscount()+"%)";
	}

}
