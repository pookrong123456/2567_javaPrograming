import java.util.Scanner;

import javax.swing.*;
public class Lab303_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String word;
		int num =0;
		
		
			System.out.print("Input a sentance : ");
			word = kb.nextLine();
			while(!word.endsWith(".")) {
				System.out.print("Input a sentance,again : ");
				word = kb.nextLine();
							
		}
			for(int i =0; i<word.length();i++) {
				char ch = word.charAt(i);
				if(ch == ' ') {
					num++;
					
				}
				
			}
			System.out.println();
			System.out.println("The sentence has"+num+"spacebar.");
			System.out.println("The sentence has"+(num+1)+"word.");
			

	}

}
