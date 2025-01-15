
import java.util.Scanner;	
public class Lab503 {
	public static void main(String[] args) {
        
        int[] number = new int[7];
        Scanner scanner = new Scanner(System.in);
        
       
        for (int i = 0; i < number.length; i++) {
            System.out.printf("Input number %d: ", i + 1);
            number[i] = scanner.nextInt();
        }
        
        
        int oddCount = 0;
        String oddNum = ""; 
        
       
        for (int num : number) {
            if (num % 2 != 0) { 
                oddCount++;
                oddNum += num + " "; 
            }
        }
        
        
        System.out.println("");
        System.out.println("There are " + oddCount + " odd number(s).");
        System.out.println("List of odd number(s): " + oddNum.trim());
        
        scanner.close(); //
    }
}
