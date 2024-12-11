import javax.swing.*;

public class Lad105 {
    public static void main(String[] args) {
        final double TAX_RATE = 0.0625; 
        String cdId;
        String cdTitle;
        double cdPrice;
        int cdQuantity;
        double cdSubtotal;
        double cdTotal;

        JOptionPane.showMessageDialog(null, "This program calculates the total cost of a CD order");

        cdId = JOptionPane.showInputDialog("Please enter the ID of the CD");
        cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
        cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
        cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));

        cdSubtotal = cdPrice * cdQuantity;
        cdTotal = cdSubtotal * (1 + TAX_RATE);

        String output = String.format(
            "Summary of the transaction:\n" +
            "CD ID: %s\n" +
            "CD Title: %s\n" +
            "CD Unit Price: $%.2f\n" +
            "CD Quantity: %d\n" +
            "Subtotal: $%.2f\n" +
            "Tax rate: %.2f%%\n" +
            "Total: $%.2f\n\n" +
            "End of Program",
            cdId, cdTitle, cdPrice, cdQuantity, cdSubtotal, TAX_RATE * 100, cdTotal
        );

        JOptionPane.showMessageDialog(null, output);
    }
}

