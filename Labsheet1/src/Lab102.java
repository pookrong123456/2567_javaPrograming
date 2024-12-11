import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number of minutes: ");
        double min = input.nextDouble();
        int year = 60 * 24 * 365;
        int day = 60 * 24;

        int Year2 = (int) (min / year); 
        int remain = (int) (min % year); 
        int day2 = remain / day;

        System.out.println(min + " minutes is approximately " + Year2 + " years and " + days2 + " days.");

        input.close();
    }
}
