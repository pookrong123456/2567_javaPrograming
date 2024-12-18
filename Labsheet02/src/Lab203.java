import java.text.DecimalFormat;
import javax.swing.*;
public class Lab203 {
  public static void main(String[] args) {
    DecimalFormat frm = new DecimalFormat("##.#");
    String WInput = JOptionPane.showInputDialog(null, "Input Weight (kg):");
    double weight = Double.parseDouble(WInput);
    String HInput = JOptionPane.showInputDialog(null, "Input Height (cm):");
    double Cm = Double.parseDouble(HInput);
    double Meter = (Cm / 100);
    double bmi = (weight) / (Meter * Meter);
    String bmiCategory;
    if (bmi < 18.5) {
        bmiCategory = "Underweight";
        JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) +"\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
    } else if (bmi >= 18.5 && bmi <= 24.9) {
        bmiCategory = "Normal-weight";
        JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) +"\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
    } else if (bmi >= 25.0 && bmi <= 29.9) {
        bmiCategory = "Overweight";
        JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) +"\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
    } else {
        bmiCategory = "Obesity";
        JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) +"\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
    }

    }
  }