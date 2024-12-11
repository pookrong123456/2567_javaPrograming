import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        double num = input.nextDouble();

        int minYear = (60 * 24) * 365; 
        int minDay = 60 * 24;        

        int years = (int) (num / minYear); 
        int reMinu = (int) (num % minYear); 
        int days = reMinu / minDay; 

        System.out.println(num + " minutes is approximately " + years + " years and " + days + " days.");

        input.close();
    }
}
