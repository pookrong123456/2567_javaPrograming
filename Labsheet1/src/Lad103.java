import javax.swing.*;

public class Lad103 {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Input Time Parking (minute):");
        int toMin = Integer.parseInt(input);
        int min = toMin % 60;
        int hour = toMin / 60;
        double cost = (hour * 50) + (min * 0.25);
        String message = "You parked for " + hour + " Hour(s) and " + min + " Minute(s).\n";
        message += "Amount to be paid: " + String.format("%.1f", cost) + " baht.";
        JOptionPane.showMessageDialog(null, message);
    }
}
