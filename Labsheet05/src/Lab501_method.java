import javax.swing.JOptionPane;
public class Lab501_method {

	static int[] idProduct = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] priceProduct = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	static double itemPrice = 0.0;
	static boolean validItem = false;
	public static void main(String[] args) {
		
		inputItem();
		

	}
	public static void inputItem() {
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		if(checkitem(itemOrder)) {
			JOptionPane.showMessageDialog(null, "item"+itemOrder+"is"+itemPrice);
			System.out.print("item"+itemOrder+"is"+itemPrice);
			
		}else {
			JOptionPane.showMessageDialog(null,
					"Invalid item",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			System.out.print("Invalid item");
		}
	}

	public static boolean checkitem(int item) {
		for(int i=0;i<idProduct.length;i++) {
			if(item == idProduct[i]) {
				itemPrice = priceProduct[i];
				validItem =true;
	
	 	
	    }
			
      }
	 	return validItem;
    }
	
}
