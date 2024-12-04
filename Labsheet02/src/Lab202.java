import java.text.*;
import java.util.Scanner;
public class Lab202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberbefore = Integer.MIN_VALUE;
		
		while(true) {
			System.out.print("Input number : ");
			int number = input.nextInt();
			if(number<numberbefore) {
				break;
			}
			numberbefore =number;
			
		}
		System.out.println("bye bye ");
		input.close();

	}

}
