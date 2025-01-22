public class Product {
	private String name;
	private int price;
	private double vatRate;
	
	 public void setProductDetails(String name, double price, double vatRate) {
	        name = name;
	        price = price;
	        vatRate = vatRate;
	    }
	 public double calculateTotalPrice() {
	        return price + (price * vatRate / 100);
	    }
	    public void displayProductDetails() {
	        System.out.println("Product Details:");
	        System.out.println("Product Name: " + name);
	        System.out.println("Price (Before VAT): " + price);
	        System.out.println("Price (After VAT): " + calculateTotalPrice());
	    }
	}

}
}

