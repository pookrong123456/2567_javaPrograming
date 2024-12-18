
import javax.swing.JOptionPane;

public class Lab303_1 {
    public static void main(String[] args) {
        String word; 
        int num = 0; 

        word = JOptionPane.showInputDialog("Input a sentance :");

        while (!word.endsWith(".")) {
            word = JOptionPane.showInputDialog("Input a sentance, again :");
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                num++;
            }
        }

        String[] words = word.trim().split("\\s+");
        int wordCount = words.length; 

        String result = 
                       "This sentence has " + num + " spacebar(s).\n" 
                      + "This sentence has " + wordCount + " word(s).";

        JOptionPane.showMessageDialog(null, result);
    }
}
