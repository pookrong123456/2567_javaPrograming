import java.util.*;

import javax.naming.InitialContext;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName;
		String FirstName;
		System.out.println("Please enter your name, seperated by a spacs.");
		System.out.print(":");
		fullName = input.nextLine();
		int space = fullName.indexOf(' ');
		FirstName = fullName.substring(0,space);
		//System.out.println("firstName");
		System.out.println(abbreviatName(fullName)+FirstName);
			
		input.close();

	}
	public static String abbreviatName(String fName) {
		String inttaiLetter="";
		for(int i=0;i<fName.length();i++) {
			if(fName.charAt(i)==' ') {
				inttaiLetter = (inttaiLetter+fName.charAt(i+1)).toUpperCase();
				inttaiLetter = inttaiLetter+".";
			}
		}
		return inttaiLetter;
	}

}
