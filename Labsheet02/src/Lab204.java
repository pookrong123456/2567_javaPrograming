import java.util.*;
public class Lab204 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Input value of X : ");
    int x = input.nextInt();
    System.out.print("Input value of Y : ");
    int y = input.nextInt();
    while (y <= x) {
      System.out.print("Input vaue of Y, again : ");
      y = input.nextInt();

    }
    System.out.println("");
    int sum = x;
    int sum2;

    for (int i = x + 1; i <= y; i++) {
            sum2 = sum;
            sum += i;
            System.out.println(sum2 + " + " + i + " = " + sum);
        }

  }

}