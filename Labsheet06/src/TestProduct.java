import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter VAT rate (%): ");
        double vatRate = scanner.nextDouble();

        
        Product product = new Product();
        product.setProductDetails(name, price, vatRate);

      
        product.displayProductDetails();
    }
}
