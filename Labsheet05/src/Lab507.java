
import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		int[] number = new int[5];
		for(int i=0;i<number.length;i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Input number"+(i+1)+":"));
		}
		showEven(number);
		showOdd(number);
	    

	}
	public static void showEven(int[] nums) {
		String evenNumbers = "List of even numbers: ";

		for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) { 
                evenNumbers += nums[i] + " ";
            }
        }

	    JOptionPane.showMessageDialog(null, evenNumbers);
	}

		
		

    public static void showOdd(int[] nums) {
    	String evenNumbers = "List of even numbers: ";

    	for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) { 
                evenNumbers += nums[i] + " ";
            }
        }

	    JOptionPane.showMessageDialog(null, evenNumbers);
	}
		
	}


