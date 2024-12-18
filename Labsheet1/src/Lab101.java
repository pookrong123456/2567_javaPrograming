import java.util.*;
import java.text.*;
public class Lab101 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

DecimalFormat frm = new DecimalFormat("#,###.00");

System.out.print("Input product name : ");
String productName = input.nextLine();
System.out.print("Input product unit : ");
int productUnit = input.nextInt();
System.out.print("Input price per unit : ");
float productPrice = input.nextFloat();
System.out.println("--------------------------------");
float totalPriceofProduct =productUnit*productPrice;
System.out.println("Total Price is "+ frm.format(totalPriceofProduct)+" bath.");
System.out.println("--------------------------------");
//คำนวณหาผลรวมของสินค้า
System.out.print("How many discount(%) : ");
System.out.println("--------------------------------");
int discount = input.nextInt();
float totalwithVat = (totalPriceofProduct*discount/100);


double tottalPrice = totalPriceofProduct - totalwithVat;
System.out.println("Discount from "+discount+"%"+frm.format(totalwithVat)+" bath.");
System.out.println("Amount to be paid "+frm.format(tottalPrice)+" bath.");
System.out.println();

}

}