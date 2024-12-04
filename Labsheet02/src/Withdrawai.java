import javax.swing.*;
import java.util.*;
public class Withdrawai {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+balance+
				"\nInput money to withdraw : "));
		if(moneyWithdraw> balance) {
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than balance","\nERROR",JOptionPane.ERROR_MESSAGE);
					
		}else if(moneyWithdraw> 50000) {
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than 50,000","\nERROR",JOptionPane.ERROR_MESSAGE);
					
		}else if(moneyWithdraw%100!=0) {
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw "+(moneyWithdraw%100),"\nERROR",JOptionPane.ERROR_MESSAGE);
					
		}else {
			JOptionPane.showConfirmDiaLog(null,"You withdraw"+ moneyWithdraw +"baht."+(moneyWithdraw/1000),"\n1,000","\n500 = "+((moneyWithdraw%1000)/500),"\n500 = "+((moneyWithdraw%500)/100));
		}
		
				
		 

	}

}
